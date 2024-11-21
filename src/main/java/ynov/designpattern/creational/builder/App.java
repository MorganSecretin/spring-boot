package ynov.designpattern.creational.builder;

public class App {
    public static void main(String[] args) {
        ModularCar car = new ModularCar.Builder(ECarModel.SPORT, EEngineType.ESSENCE, 2).color("blue").addExtra("GPS").build();
        System.out.println(car);

        System.out.println("Erreur attendu :");

        ModularCar errorCar = new ModularCar.Builder(ECarModel.SUV, EEngineType.ELECTRIQUE, 4).build();
        System.out.println(errorCar);
    }
}
