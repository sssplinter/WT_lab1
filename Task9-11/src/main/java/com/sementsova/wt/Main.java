package com.sementsova.wt;

public class Main {
    public static void main(String[] args) {
        final Basket basket = new Basket();
        basket.addBall(new Ball(Color.Blue, 5.0F));
        basket.addBall(new Ball(Color.Yellow, 7.0F));
        basket.addBall(new Ball(Color.Red, 9.0F));
        basket.addBall(new Ball(Color.Violet, 10.5F));
        basket.addBall(new Ball(Color.Red, 10.5F));
        basket.addBall(new Ball(Color.Blue, 14.5F));
        basket.addBall(new Ball(Color.Blue, 19.5F));
        basket.addBall(new Ball(Color.Blue, 29.5F));

        System.out.println("Overall weight: " + basket.getOverallWeight());
        System.out.println("Overall weight: " + basket.getBlueBallsCount());
    }
}

//lab10
//javac D:\5Sem\WT\Laba1\Task9\src\main\java\com\sementsova\wt\Ball.java D:\5Sem\WT\Laba1\Task9\src\main\java\com\sementsova\wt\Basket.java D:\5Sem\WT\Laba1\Task9\src\main\java\com\sementsova\wt\Color.java D:\5Sem\WT\Laba1\Task9\src\main\java\com\sementsova\wt\Main.java
//java -classpath D:\5Sem\WT\Laba1\Task9\src\main\java com.sementsova.wt.Main


// lab 11
//javac -d out src/main/java/com/sementsova/wt/*.java
//cd out
//jar cfe main.jar com.sementsova.wt.Main com/sementsova/wt/*.class
//java -jar main.jar
