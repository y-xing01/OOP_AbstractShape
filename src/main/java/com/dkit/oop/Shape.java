package com.dkit.oop;
// Abstract class
// - if a class defines one or more abstract methods then
//   the class must be declared as abstract (as in this example)
// - an abstract class can NOT be instantiated (i.e. it is not
//   possible to create an object of the class using 'new ClassName()'
// - subclasses MUST implement all abstract methods e.g. area()
//   (the compiler will indicate an error if a subclass does not
//   implement a method that has been declared as 'abstract'
//   (So, writers of subclasses are *forced* to implement all methods)
//
// - the area() method is declared as "abstract", so developers who
//   extend this class must implement an area() method. The reason that we
//   impose the abstract method, is because we want to be able to get th earea()
//   of all shapes (by calling area() on any shape object)


// Shape class
// A drawing package needs to represent shape objects (Rectangles, Circles, etc)
// All shape objects must have a position, an (x,y) co-ordinate that represents
// the top left corner of the object's position (bounding rectangle).
// All shapes must provide an area() method.
// Therefore, we choose to define an ABSTRACT area() method,
// and consequently, we must define the Shape class as ABSTRACT also.
// All subclasses will have to implement area().

public abstract class Shape {

    private int x; // position top left corner  - a field required in all subclasses
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * area()
     * Abstract method that must be implemented by all subclasses that extend
     * this class. Declaring the method as 'abstract' will force classes that
     * inherit from this class to implement the method.
     *
     * @return area of the shape
     * (see Rectangle::area() and Circle::area() for implementations)
     */
    public abstract double area();   // no method body is allowed in an abstract method


    // methods common to all Shape objects
    public int getX() { return x; }
    public void setX(int x) { this.x = x;}
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public String toString() {
        return this.getClass().getName() +
                "(x=" + this.x + ",y=" + this.y + ")";
    }
}
