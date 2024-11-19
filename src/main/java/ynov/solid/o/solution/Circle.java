package ynov.solid.o.solution;

public class Circle implements IShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getTotalArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
