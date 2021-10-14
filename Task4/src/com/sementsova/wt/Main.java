package com.sementsova.wt;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        PrimeNumbersFinder finder = new PrimeNumbersFinder();
        List<Integer> indicesList = finder.printPrimeIndices(new int[]{5, 7, 12, 18, 3, 9, 65, 11});

        System.out.println("Indices of prime numbers:\n" + indicesList.toString());
    }
}
