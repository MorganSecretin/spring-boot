package ynov.solid.d.solution;

public class App {
    public static void main(String[] args) {
        Car car = new Car(new GasEngine());
        car.start();

        car = new Car(new ElectricEngine());
        car.start();

        car = new Car(new MagicEngine());
        car.start();
    }

    static class MagicEngine implements IEngine {
        public void start() {
            System.out.println("Magic engine started.");
        }
    }
}
