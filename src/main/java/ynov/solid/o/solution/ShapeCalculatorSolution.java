package ynov.solid.o.solution;

import java.util.List;

public class ShapeCalculatorSolution {
    public double calculateTotalArea(List<IShape> shapes) {
        double totalArea = 0;
        for (IShape shape : shapes) {
            totalArea += shape.getTotalArea();
        }
        return totalArea;
    }
}