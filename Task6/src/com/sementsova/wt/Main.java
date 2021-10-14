package com.sementsova.wt;

public class Main {

    public static void main(String[] args) {
        MatrixGenerator generator = new MatrixGenerator();
        TerminalPresenter presenter = new TerminalPresenter();

        presenter.printMatrix(generator.generateMatrix(new double[]{1.199, 2.2, 3.321, 4.4, 5.48, 6.6}));
    }
}
