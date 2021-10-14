package com.sementsova.wt;

public class Ball {
    private final Color color;
    private final float weight;

    public Ball(final Color color,
                final float weight){
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public float getWeight() {
        return weight;
    }
}
