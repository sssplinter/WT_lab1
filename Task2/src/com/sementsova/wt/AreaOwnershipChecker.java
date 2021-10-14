package com.sementsova.wt;

public class AreaOwnershipChecker {
    private static final int X_UP = 4;
    private static final int X_DOWN = 6;
    private static final int Y_MAX = 5;
    private static final int Y_MIN = -3;

    public boolean checkAreaOwnership(final int x, final int y){
        if(y > 0 && y <= Y_MAX){
            return x >= -X_UP && x <= X_UP;
        } else if( y <= 0 && y >= Y_MIN){
            return x >= -X_DOWN && x <= X_DOWN;
        }

        return false;
    }
}
