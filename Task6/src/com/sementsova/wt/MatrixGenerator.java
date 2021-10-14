package com.sementsova.wt;

public class MatrixGenerator {

    public double[][] generateMatrix(final double[] arr){
        int arrSize = arr.length;
        double[][] matrix = new double[arrSize][arrSize];

        for(int i = 0; i < arrSize; i++){
            for(int j = 0; j < arrSize; j++){
                matrix[i][j] = arr[(j+i) % arrSize];
            }
        }

        return matrix;
    }
}
