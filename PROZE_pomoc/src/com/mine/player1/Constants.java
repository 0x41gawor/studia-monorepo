package com.mine.player1;

public class Constants {
    public static String TITLE = "PLayer1 game";
    /**
     Window width in pixels
     */
    public static int WINDOW_SIZE_X=600;
    /**
     Window height in pixels
     */
    public static int WINDOW_SIZE_Y=600;
    /**
     Width of map in tiles
     */
    public static int MAP_SIZE_X=12;
    /**
     Height of map in tiles
     */
    public static int MAP_SIZE_Y=12;
    /**
     Size of single tile
     Just one value because tile is a rectangle
     */
    public static int GRID_X=50;
    public static int GRID_Y=50;

    public static int PLAYER_MOVEMENT_SPEED_X = 6 * GRID_X; // 300px/s
    public static int PLAYER_MOVEMENT_SPEED_Y = 6 * GRID_Y; // 300px/s
}
