package com.sementsova.wt;

public class Main {

    public static void main(String[] args) {
        double a = 3.67;
        double b = 189.45;
        double h = 10.5;

        FunctionTableCreator resultTableCreator = new FunctionTableCreator();
        TerminalPresenter terminalPresenter = new TerminalPresenter();

        terminalPresenter.printMap(resultTableCreator.formFunctionTable(a, b, h));
    }
}
