package com.zipcodewilmington.froilansfarm;

public class FarmBuilder {
    private Field field = new Field();
    private FarmHouse farmHouse = new FarmHouse();
    private Container<Stable> stables = new Container<>();
    private Container<ChickenCoop> coops = new Container<>();
    private Container<VehicleInterface> garage = new Container<>();

    public FarmBuilder setField(Field field) {
        this.field = field;
        return this;
    }

    public FarmBuilder setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
        return this;
    }

    public FarmBuilder setStables(Container<Stable> stables) {
        this.stables = stables;
        return this;
    }

    public FarmBuilder setCoops(Container<ChickenCoop> coops) {
        this.coops = coops;
        return this;
    }

    public FarmBuilder setGarage(Container<VehicleInterface> garage) {
        this.garage = garage;
        return this;
    }

    public Farm createFarm() {
        return new Farm(field, farmHouse, stables, coops, garage);
    }
}