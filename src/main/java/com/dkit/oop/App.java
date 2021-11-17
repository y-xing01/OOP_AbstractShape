package com.dkit.oop;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Abstract class Shape
 * oop-abstract-class-shape
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Abstract Class Shape" );
        App app = new App();
        app.start();
    }

    public void start() {

        //  Shape s1 = new Shape(2,3);  // compiler will complain. Cannot create an object of an Abstract class.
        System.out.println();
        Circle c1 = new Circle(1,2,5);
        System.out.println(c1.toString());

        //TODO
        // implement the Rectangle class (see skeleton Rectangle class).
        System.out.println();
        Rectangle r1 = new Rectangle(1,2, 1,2);
        System.out.println(r1.toString());

        //TODO
        // create an ArrayList and populate it with two Circles and two Rectangles.
        System.out.println();
        Circle c2 = new Circle(1, 2, 8);
        Rectangle r2 = new Rectangle(1, 2, 3, 4);
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(c1);
        shapes.add(c2);
        shapes.add(r1);
        shapes.add(r2);


        // write a displayList() method that accepts the list and display all elements.
        displayList(shapes);
        // using a for loop, sum the area of all the shapes and output that sum.
        System.out.printf("\nTotal sum area of all shapes is : %.2f", sumArea(shapes));
        System.out.println("\n");
        //TODO
        // The senior architect informs you that all shapes MUST have a method
        // called perimeter() that returns the perimeter of the shape.
        // Make the appropriate changes to the Shape, Circle and Rectangle classes.
        System.out.println("Perimeter of all shapes");
        System.out.println("***********************");
        for(Shape shape : shapes)
        {
            System.out.printf("%.2f\n", shape.perimeter());
        }
    }

    public void displayList(ArrayList<Shape> shapes)
    {
        System.out.println("List of Shapes");
        System.out.println("**************");
        for(Shape shape : shapes)
        {
            System.out.println(shape.toString());
        }
    }

    public double sumArea(ArrayList<Shape> shapes)
    {
        double totalArea = 0;
        for(Shape shape : shapes)
        {
           totalArea += shape.area();
        }
        return totalArea;
    }

}
