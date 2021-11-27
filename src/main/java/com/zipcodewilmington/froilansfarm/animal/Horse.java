package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;
import com.zipcodewilmington.froilansfarm.animal.AbstractAnimal;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/24/21 5:53 PM
 */
public class Horse extends AbstractAnimal implements Rideable {
    private Rider rider;

    @Override
    public String getNoise() {
        return "Neigh!";
    }

    @Override
    public void setRider(Rider rider) {
        this.rider = rider;
    }

    @Override
    public Rider getRider() {
        return rider;
    }
}
