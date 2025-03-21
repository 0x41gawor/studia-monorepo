package com.mine.player1;

import com.mine.util.Clock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel implements Runnable {

    Dimension SCREEN_SIZE = new Dimension(Constants.WINDOW_SIZE_X, Constants.WINDOW_SIZE_Y);

    Player player;
    Map map = new Map();

    Clock clock;
    Thread gameThread;

    boolean isPause = false;
    //------------------------------------------------------------------------------------------------------------------------- C O N S T R U C T O R
    GamePanel() {
        player = new Player(100,100,Constants.GRID_X,Constants.GRID_Y,Constants.PLAYER_MOVEMENT_SPEED_X,Constants.PLAYER_MOVEMENT_SPEED_Y);

        clock = new Clock();

        this.setFocusable(true);
        this.addKeyListener(new InputHandler());
        this.addComponentListener(new ResizeHandler());
        //this.setPreferredSize(SCREEN_SIZE);

        gameThread = new Thread(this);
        gameThread.start();
    }

    //------------------------------------------------------------------------------------------------------------------------- G A M E   L O O P


    @Override
    public void run() {
        // główna pętla gry
        double dt;
        while(true) {
            dt = clock.restart();
            if(!isPause) _update(dt);
            repaint();
            sleep();
        }
    }

    private void _update(double dt) {
        player._update(dt);
    }

    public void paint(Graphics g) {
        // Background
        g.setColor(Color.black);
        g.fillRect(0,0,SCREEN_SIZE.width,SCREEN_SIZE.height);

        if(isPause) {
            g.setColor(Color.red);
            g.fillOval(200,200,200,200);
        }

        // Player
        map.draw(g);
        player.draw(g);


        // optionally
        g.dispose();
    }

    private void sleep() {
        try {
            Thread.sleep(15);
        } catch (InterruptedException ignored) {
        }
    }

    //------------------------------------------------------------------------------------------------------------------------- A U X I L L A R Y   M E T H O D S

    public Dimension getPreferredSize() {
        return SCREEN_SIZE;
    }

    public void pause() {
        if(!isPause) {
            isPause = true;
        }
        else {
            isPause = false;
        }
    }


    //------------------------------------------------------------------------------------------------------------------------- N E S T E D    C L A S S E S

    public class InputHandler extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()==KeyEvent.VK_P) {
                pause();
            }
            else {
                player.keyPressed(e);
            }
        }
        public void keyReleased(KeyEvent e) {
            player.keyReleased(e);
        }
    }

    public class ResizeHandler extends ComponentAdapter {
        public void componentResized(ComponentEvent e) {
            Dimension oldScreenSize = SCREEN_SIZE;
            SCREEN_SIZE = e.getComponent().getSize();
            System.out.println("Resized to " + SCREEN_SIZE);

            newConstantValues();
            resizePlayer(oldScreenSize);
        }
        private void newConstantValues() {
            Constants.WINDOW_SIZE_X = SCREEN_SIZE.width;
            Constants.WINDOW_SIZE_Y = SCREEN_SIZE.height;
            Constants.GRID_X = Constants.WINDOW_SIZE_X / Constants.MAP_SIZE_X;
            Constants.GRID_Y = Constants.WINDOW_SIZE_Y / Constants.MAP_SIZE_Y;
            Constants.PLAYER_MOVEMENT_SPEED_X = 6 * Constants.GRID_X;
            Constants.PLAYER_MOVEMENT_SPEED_Y = 6 * Constants.GRID_Y;
        }
        private void resizePlayer(Dimension oldScreenSize) {
            player.setSize(SCREEN_SIZE.width/(Constants.WINDOW_SIZE_X/Constants.GRID_X),SCREEN_SIZE.height/(Constants.WINDOW_SIZE_Y/Constants.GRID_Y));
            player.set_posX(player.get_posX()/(double) oldScreenSize.width*(double) SCREEN_SIZE.width);
            player.set_posY(player.get_posY()/(double) oldScreenSize.height*(double) SCREEN_SIZE.height);

            player.set_movementSpeedX( Constants.PLAYER_MOVEMENT_SPEED_X );
            player.set_movementSpeedY( Constants.PLAYER_MOVEMENT_SPEED_Y );
        }
    }
}
