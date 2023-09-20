package com.workintech.d3oop;

public class Wall {
    double width;
    double height;

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        if (height < 0) height = 0;
        this.height = height;
    }

    public void setWidth(double width) {
        if (width < 0) width = 0;
        this.width = width;
    }

    public double getArea() {
        return width * height;
    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }
}
