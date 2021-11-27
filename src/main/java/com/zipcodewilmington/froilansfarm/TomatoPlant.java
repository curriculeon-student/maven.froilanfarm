package com.zipcodewilmington.froilansfarm;

import java.util.function.Supplier;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/24/21 5:38 PM
 */
public class TomatoPlant extends AbstractCrop<Tomato> {
    @Override
    public Supplier<Tomato> getEdibleSupplier() {
        return Tomato::new;
    }
}
