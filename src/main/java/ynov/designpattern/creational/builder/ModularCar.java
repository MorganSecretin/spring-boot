package ynov.designpattern.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class ModularCar {
    private ECarModel model;
    private EEngineType engineType;
    private String color;
    private int nbSeats;
    private List<String> options;

    private ModularCar(ECarModel model, EEngineType engineType, int nbSeats, String color, List<String> options) {
        this.model = model;
        if (model == ECarModel.SPORT && engineType == EEngineType.ELECTRIQUE) {
            throw new IllegalArgumentException("Sport car can't have electric engine");
        }
        if (model == ECarModel.SUV && nbSeats < 5) {
            throw new IllegalArgumentException("SUV car must have at least 5 seats");
        }
        this.engineType = engineType;
        this.nbSeats = nbSeats;
        this.color = color;
        this.options = options;
    }

    public static class Builder {
        private ECarModel model;
        private EEngineType engineType;
        private int nbSeats;
        private String color;
        private List<String> options;

        public Builder(ECarModel model, EEngineType engineType, int nbSeats) {
            this.model = model;
            this.engineType = engineType;
            this.nbSeats = nbSeats;
            this.color = "undefined";
            this.options = new ArrayList<>();
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder addExtra(String option) {
            this.options.add(option);
            return this;
        }

        public ModularCar build() {
            return new ModularCar(model, engineType, nbSeats, color, options);
        }
    }

    public ECarModel getModel() {
        return model;
    }

    public EEngineType getEngineType() {
        return engineType;
    }

    public String getColor() {
        return color;
    }

    public int getNbSeats() {
        return nbSeats;
    }

    public List<String> getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return "ModularCar [model=" + model + ", engineType=" + engineType + ", color=" + color + ", nbSeats=" + nbSeats
                + ", options=" + options.toString() + "]";
    }

    
}
