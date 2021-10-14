package com.sementsova.wt;

public class Test {

    public void mergeAscendingSequences(final int[] sequence1, final int[] sequence2) {
        int k = 0;
        for (int i = 0; i < sequence2.length; i++) {
            while (k < sequence1.length - 1 && sequence1[k] < sequence2[i]) {
                k++;
            }
            if(k + 1 < i) {
                System.out.printf("seq2: %d after seq1: %d  \n", i, k);
            } else {
                System.out.printf("seq2: %d before seq1: %d  \n", i, k);
            }


        }
    }
}
