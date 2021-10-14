package com.sementsova.wt;

import java.util.HashMap;

public class FunctionTableCreator {

    HashMap<Double, Double> functionTable = new HashMap<>();

    public HashMap<Double, Double> formFunctionTable(final double leftBound, final double rightBound, final  double step){
        for(double i = leftBound; i <= rightBound; i += step){
            functionTable.put(i, calculateFunctionValue(i));
        }

        return functionTable;
    }

    private double calculateFunctionValue(final double x){
        return Math.tan(x);
    }
}
