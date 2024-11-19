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
        if (!validDimension(width)) return;
        this.width = width;
    }

    public void setHeight(int height) {
        if (!validDimension(height)) return;
        this.height = height;
    }

    private boolean validDimension(int dimension) {
        boolean isValid = dimension > 0;
        if (!isValid) System.err.println("La dimension doit être supérieure à zéro");
        return isValid;
    }

    public int calculateArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    @Override
    public void setHeight(int height) {
        super.setWidth(height);
    }

    @Override
    public int calculateArea() {
        return width * width;
    }
}

