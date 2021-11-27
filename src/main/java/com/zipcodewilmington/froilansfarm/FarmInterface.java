package com.zipcodewilmington.froilansfarm;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/27/21 12:03 AM
 */
public interface FarmInterface {
    Field getField();

    FarmHouse getFarmHouse();

    Container<VehicleInterface> getGarage();

    Container<ChickenCoop> getCoops();

    Container<Stable> getStables();
}
