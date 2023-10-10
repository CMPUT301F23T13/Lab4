package com.example.debuggingdemons;

public class Square extends Shape {
    private int sideLength;

    private String color = "blue";
    //Testing comments
    public Square(int x, int y, int sideLength) {
        super(x,y);
        this.sideLength = sideLength;

    }
}
