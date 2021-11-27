package com.zipcodewilmington.froilansfarm;

import java.util.function.Supplier;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/24/21 5:29 PM
 */
public class CornStalk extends AbstractCrop<EarCorn> {
    @Override
    public Supplier<EarCorn> getEdibleSupplier() {
        return EarCorn::new;
    }
}
