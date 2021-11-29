package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.produce.Egg;
import com.zipcodewilmington.froilansfarm.produce.ProduceInterface;

import java.util.function.Supplier;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/24/21 5:58 PM
 */
public class Chicken extends AbstractAnimal implements ProduceInterface<Egg> {
    private boolean hasBeenFertilized;

    @Override
    public Supplier<Egg> getEdibleSupplier() {
        return Egg::new;
    }

    @Override
    public Boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }

    @Override
    public void fertilize() {
        this.hasBeenFertilized = true;
    }

    @Override
    public void sterilize() {
        this.hasBeenFertilized = false;
    }

    @Override
    public String getNoise() {
        return "Cluck!";
    }
}