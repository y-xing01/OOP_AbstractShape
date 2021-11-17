package com.dkit.oop;
//TODO
// change Rectangle declaration so that Rectangle inherits from Shape

public class Rectangle extends Shape{

    //TODO
    // Rectangle requires fields 'width' and 'height'.
    // implement toString() and getters/setters.
    // area() must be implemented.

    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + "[" +
                "width=" + width +
                ", height=" + height +
                ']';
    }

    @Override
    public double area()
    {
        return this.height*this.width;
    }

    @Override
    public double perimeter() { return 2*(this.height+this.width); }
}
