package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.containers.ContainerInterface;
import com.zipcodewilmington.froilansfarm.produce.Edible;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/24/21 5:04 PM
 */
public interface Eater {
    ContainerInterface<Edible> getEatenObjects();

    default void eat(Edible edible) {
        getEatenObjects().add(edible);
    }
}
