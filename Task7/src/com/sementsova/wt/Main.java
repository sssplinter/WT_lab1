package com.sementsova.wt;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ShellSorter sorter = new ShellSorter();
        System.out.println(Arrays.toString(sorter.sort(new int[]{5, 78, 23, 11, 5, 89, 36, 11})));
    }
}
