package com.mine.player1;

import java.awt.*;

public class Map {
    private final int[][] mapArray = new int[Constants.MAP_SIZE_X][Constants.MAP_SIZE_Y];


    public Map() {
        // Fill map with zeros
        for(int x = 0; x<Constants.MAP_SIZE_X; x++) {
            for (int y = 0; y<Constants.MAP_SIZE_Y; y++) {
                mapArray[x][y]=0;
            }
        }
        // Add some random ones
        mapArray[0][0] = 1;
        mapArray[2][2] = 1;
        mapArray[2][3] = 1;
        mapArray[2][4] = 1;
        mapArray[3][5] = 1;
        mapArray[11][11] = 1;
    }

    public void draw(Graphics g) {
        g.setColor(Color.orange);
        for(int x = 0; x<Constants.MAP_SIZE_X; x++) {
            for (int y = 0; y<Constants.MAP_SIZE_Y; y++) {
                if(mapArray[x][y] == 1) {
                    g.fillRect(x*Constants.GRID_X+1, y*Constants.GRID_Y+1,Constants.GRID_X-1, Constants.GRID_Y-1);
                }
            }
        }
    }
}
