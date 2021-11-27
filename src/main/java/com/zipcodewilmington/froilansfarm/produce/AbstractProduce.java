package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.Edible;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/24/21 5:20 PM
 */
abstract public class AbstractProduce<EdibleType extends Edible>
        implements ProduceInterface<EdibleType> {
    private boolean hasBeenFertilized;

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
}
