package com.sementsova.wt;

public class ShellSorter {

    public int[] sort(final int[] arr){
        int tempValue;

        for(int j = 0; j <  arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    tempValue = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tempValue;
                    i--;
                }
            }
        }

        return arr;
    }
}
