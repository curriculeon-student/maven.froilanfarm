package com.zipcodewilmington.froilansfarm.animal.person;

import com.zipcodewilmington.froilansfarm.containers.Farm;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/26/21 9:00 PM
 */
public class Froilan extends Farmer {
    @Override
    void farm(Farm farm) {
        farm
                .getStables()
                .getAll()
                .forEach(stable -> stable
                        .getAll()
                        .forEach(horse -> {
                            this.mount(horse);
                            this.dismount(horse);
                        }));
    }
}
