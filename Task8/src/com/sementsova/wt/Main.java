package com.sementsova.wt;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Test test = new Test();
        int[] seq1 = new int[]{1, 4, 7, 11};
        int[] seq2 = new int[]{2, 3, 5, 6, 8, 9, 15};
        System.out.println(Arrays.toString(seq1));
        System.out.println(Arrays.toString(seq2));
        test.mergeAscendingSequences(seq1, seq2);
    }
}
