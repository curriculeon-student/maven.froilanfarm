package com.zipcodewilmington.froilansfarm.produce;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/24/21 5:18 PM
 */
public interface CropInterface<EdibleType extends Edible> extends ProduceInterface<EdibleType> {
    Boolean hasBeenHarvested();
    void harvest();
}
