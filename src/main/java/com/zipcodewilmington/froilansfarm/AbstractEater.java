package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.containers.Container;
import com.zipcodewilmington.froilansfarm.containers.ContainerInterface;
import com.zipcodewilmington.froilansfarm.produce.Edible;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/24/21 5:54 PM
 */
abstract public class AbstractEater implements Eater {
    private ContainerInterface<Edible> stomach;

    public AbstractEater() {
        this(new Container<>());
    }

    public AbstractEater(ContainerInterface<Edible> stomach) {
        this.stomach = stomach;
    }

    @Override
    public ContainerInterface<Edible> getEatenObjects() {
        return this.stomach;
    }
}
