package com.sementsova.wt;

public class Main {
    public static void main(String[] args) {
        AreaOwnershipChecker checker = new AreaOwnershipChecker();
        int x = 4;
        int y = -2;
        System.out.printf("Does the point (%d, %d) belong to the area?\n", x, y);
        System.out.println(checker.checkAreaOwnership(x, y));
    }
}
