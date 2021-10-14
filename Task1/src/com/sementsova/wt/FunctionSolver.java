package com.sementsova.wt;

public class FunctionSolver {

    public double calculate(final double x, final double y) {
        final double numerator = 1 + Math.pow( Math.sin(x + y), 2);

        final double denominator = 2 + Math.abs(x - (2 * x / (1 + x * x * y * y)));

        return numerator/denominator + x;
    }
}
