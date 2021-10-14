package com.sementsova.wt;

import java.util.Map;

public class TerminalPresenter{

    public void printMap(final Map<Double, Double> table){
        System.out.println("|    x   |   F(x)  |");
        for (Map.Entry<Double, Double> item : table.entrySet()){
            System.out.printf("| %.3f | %.3f |\n", item.getKey() , item.getValue());
        }
    }
}
