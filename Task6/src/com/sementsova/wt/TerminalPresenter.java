package com.sementsova.wt;

public class TerminalPresenter {

    public void printMatrix(final double[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.printf("%.3f   ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
