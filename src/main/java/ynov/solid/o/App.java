package ynov.solid.o;

import java.util.ArrayList;
import java.util.List;

import ynov.solid.o.solution.Circle;
import ynov.solid.o.solution.IShape;
import ynov.solid.o.solution.Rectangle;
import ynov.solid.o.solution.ShapeCalculatorSolution;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, SOLID Open/Closed Principle!");
        
        // Create a list of shapes
        List<IShape> shapes = new ArrayList<>();
        System.out.println("Creating a circle with radius 5");
        shapes.add(new Circle(5));
        System.out.println("Creating a rectangle with width 10 and height 20");
        shapes.add(new Rectangle(10, 20));
        
        // Calculate the total area of the shapes
        ShapeCalculatorSolution calculator = new ShapeCalculatorSolution();
        double totalArea = calculator.calculateTotalArea(shapes);
        System.out.println("Total area of the shapes: " + totalArea);
    }
}
