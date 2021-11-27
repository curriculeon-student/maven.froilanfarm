package com.zipcodewilmington.froilansfarm.animal.person;


import com.zipcodewilmington.froilansfarm.BotanistInterface;
import com.zipcodewilmington.froilansfarm.containers.Farm;
import com.zipcodewilmington.froilansfarm.Rider;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/24/21 5:41 PM
 */
abstract public class Farmer extends AbstractPerson implements Rider, BotanistInterface {
    abstract void farm(Farm farm);

    @Override
    public String getNoise() {
        return "Hello! I'm farming";
    }
}
