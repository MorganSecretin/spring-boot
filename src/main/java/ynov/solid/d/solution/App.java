package ynov.solid.d.solution;

public class App {
    public static void main(String[] args) {
        Car car = new Car(new GasEngine());
        car.start();

        car = new Car(new ElectricEngine());
        car.start();
    }
}
