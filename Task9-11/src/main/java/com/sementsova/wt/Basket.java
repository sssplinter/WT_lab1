package com.sementsova.wt;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    final List<Ball> balls;

    public Basket(){
        balls = new ArrayList<>();
    }

    public void addBall(final Ball ball){
        balls.add(ball);
    }

    public float getOverallWeight(){
        float overallWeight = 0;
        for(Ball ball : balls){
            overallWeight += ball.getWeight();
        }

        return overallWeight;
    }

    public int getBlueBallsCount(){
        int count = 0;
        for(Ball ball : balls){
            if(ball.getColor() == Color.Blue){
                count++;
            }
        }

        return count;
    }
}
