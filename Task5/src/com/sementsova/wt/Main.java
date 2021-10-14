package com.sementsova.wt;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] table = new int[]{76, 1, 13, 2, 7, 16, 18, 56, 9};

        NotIncreasingElementsFinder finder = new NotIncreasingElementsFinder();
        List<Integer> list = finder.getUselessNumbers(table);

        System.out.println("Table:\n" + Arrays.toString(table) +
                "\nLeast number of items to exclude: " + list.size() +
                "\nElements to be excluded:\n" + list);
    }
}
