package ynov.solid.l.solution;

public class AreaCalculation {
    public static void main(String[] args) {
        Rectangle rectangle = new Square();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        System.out.println("Aire : " + rectangle.calculateArea());
    }
}

class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
    }

    @Override
    public int calculateArea() {
        return width * width;
    }
}

