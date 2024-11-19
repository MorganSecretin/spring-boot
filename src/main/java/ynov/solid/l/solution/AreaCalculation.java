package ynov.solid.l.solution;

public class AreaCalculation {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        System.out.println("Aire rectangle : " + rectangle.calculateArea());

        Square square = new Square();
        square.setSide(5);
        System.out.println("Aire carré : " + square.calculateArea());
    }
}

abstract class AShape {
    abstract int calculateArea();

    public boolean validDimension(int dimension) {
        boolean isValid = dimension > 0;
        if (!isValid) System.err.println("La dimension doit être supérieure à zéro");
        return isValid;
    }
} 

class Rectangle extends AShape {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        if (!validDimension(width)) return;
        this.width = width;
    }

    public void setHeight(int height) {
        if (!validDimension(height)) return;
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }
}

class Square extends AShape {
    protected int side;

    public void setSide(int side) {
        if (!validDimension(side)) return;
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return side * side;
    }
}

