package com.sementsova.wt;

import java.util.ArrayList;

public class PrimeNumbersFinder {

    public ArrayList<Integer> printPrimeIndices(final int[] arr) {
        ArrayList<Integer> primeIndicesList = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                primeIndicesList.add(i);
            }
        }

        return primeIndicesList;
    }

    private boolean isPrime(final int value) {
        int temp;
        for (int i = 2; i < value / 2; i++) {
            temp = value % i;
            if (temp == 0) {
                return false;
            }
        }

        return true;
    }
}
