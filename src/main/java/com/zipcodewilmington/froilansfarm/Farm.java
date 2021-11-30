package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animal.ChickenCoop;
import com.zipcodewilmington.froilansfarm.animal.Stable;
import com.zipcodewilmington.froilansfarm.containers.Container;
import com.zipcodewilmington.froilansfarm.containers.FarmHouse;
import com.zipcodewilmington.froilansfarm.containers.FarmInterface;
import com.zipcodewilmington.froilansfarm.containers.Field;
import com.zipcodewilmington.froilansfarm.vehicle.VehicleInterface;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/24/21 6:00 PM
 */
public final class Farm implements FarmInterface {
    private final Field field;
    private final FarmHouse farmHouse;
    private final Container<VehicleInterface> garage;
    private final Container<ChickenCoop> coops;
    private final Container<Stable> stables;

    public Farm(Field field, FarmHouse farmHouse, Container<Stable> stables, Container<ChickenCoop> coops, Container<VehicleInterface> garage) {
        this.field = field;
        this.stables = stables;
        this.coops = coops;
        this.farmHouse = farmHouse;
        this.garage = garage;
    }

    public Farm() {
        this(new Field(), new FarmHouse(), new Container<>(), new Container<>(), new Container<>());
    }

    @Override
    public Field getField() {
        return field;
    }

    @Override
    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    @Override
    public Container<VehicleInterface> getGarage() {
        return garage;
    }

    @Override
    public Container<ChickenCoop> getCoops() {
        return coops;
    }

    @Override
    public Container<Stable> getStables() {
        return stables;
    }
}