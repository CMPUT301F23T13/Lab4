package com.example.debuggingdemons;

public class Square extends Shape {
    private int sideLength;

    public Square(int x, int y, int sideLength) {
        super(x,y);
        this.sideLength = sideLength;
    }
}
