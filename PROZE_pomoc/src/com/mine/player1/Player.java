package com.mine.player1;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Player extends Rectangle {

    int movementSpeedX;
    int movementSpeedY;
    int movementX = 0; // Possible values are -1,0,1    {0 stoimy, -1 idziemy w lewo, 1 idziemy w prawo}
    int movementY = 0; // Possible values are -1,0,1    {0 stoimy, -1 idziemy do góry, 1 idziemy w dół}

    double posX;
    double posY;

    public Player(int posX, int posY, int width, int height, int movementSpeedX, int movementSpeedY) {
        super(posX,posY,width,height);
        this.posX = posX;
        this.posY = posY;
        this.movementSpeedX = movementSpeedX;
        this.movementSpeedY = movementSpeedY;
    }

    // Should be called in GamePanel.paint()
    public void draw(Graphics g) {
        g.setColor(Color.green);
        g.fillRect((int)posX,(int)posY,width,height);
    }
    // Should be called in GamePanel._update()
    public void _update(double dt) {
        //x = x + (int)(movementX * movementSpeed * dt);
        //y = y + (int)(movementY * movementSpeed * dt);
        posX = posX + movementX * movementSpeedX * dt;
        posY = posY + movementY * movementSpeedY * dt;

    }
    // Should be called in GamePanel.InputHandler.keyPressed()
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_UP) {
            movementY = -1;
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN) {
            movementY = 1;
        }
        if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
            movementX = 1;
        }
        if(e.getKeyCode()==KeyEvent.VK_LEFT) {
            movementX = -1;
        }
    }
    // Should be called in GamePanel.InputHandler.keyReleased()
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN) {
            movementY = 0;
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_RIGHT) {
            movementX = 0;
        }
    }

    public double get_posX() {
        return posX;
    }

    public double get_posY() {
        return posY;
    }

    public void set_posX(double x) {
        this.posX = x;
    }

    public void set_posY(double y) {
        this.posY = y;
    }
    public void set_movementSpeedX(int movementSpeedX) {
        this.movementSpeedX = movementSpeedX;
    }
    public void set_movementSpeedY(int movementSpeedY) {
        this.movementSpeedY = movementSpeedY;
    }
}
