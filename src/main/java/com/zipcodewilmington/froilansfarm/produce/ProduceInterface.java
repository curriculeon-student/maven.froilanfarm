package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.Edible;

import java.util.function.Supplier;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/24/21 5:16 PM
 */
public interface ProduceInterface<EdibleType extends Edible> {
    Supplier<EdibleType> getEdibleSupplier();

    Boolean hasBeenFertilized();

    void fertilize();

    void sterilize();

    default EdibleType yield() {
        if (hasBeenFertilized())
            return getEdibleSupplier().get();
        String identity = getClass().getName() + "@" + hashCode();
        throw new RuntimeException(String.format("%s has not yet been been fertilized", identity));
    }
}
