package com.example.debuggingdemons;

public class Pentagon extends Shape {

    private int sideLength;
    private double sideAngle;

    public Pentagon(int x, int y, int sideLength, double sideAngle) {
        super(x,y);
        this.sideLength = sideLength;
        this.sideAngle = sideAngle;

    }
}

