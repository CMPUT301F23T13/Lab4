package com.example.debuggingdemons;

public class Triangle extends Shape{
    private int z;
    private String color = "blue";
    
    public Triangle(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}
