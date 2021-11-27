package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.Edible;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/24/21 5:24 PM
 */
abstract public class AbstractCrop<EdibleType extends Edible>
        extends AbstractProduce<EdibleType>
        implements CropInterface<EdibleType> {
    private boolean hasBeenHarvested;

    @Override
    public Boolean hasBeenHarvested() {
        return this.hasBeenHarvested;
    }

    @Override
    public void harvest() {
        this.hasBeenHarvested = true;
    }
}
