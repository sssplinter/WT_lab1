package com.sementsova.wt;

public class Main {
    public static void main(String[] args) {
        FunctionSolver solver = new FunctionSolver();
        System.out.printf("Result of the function: %.4f", solver.calculate(3.1, 5.76));
    }
}
