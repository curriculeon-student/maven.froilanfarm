package com.zipcodewilmington.froilansfarm;


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
