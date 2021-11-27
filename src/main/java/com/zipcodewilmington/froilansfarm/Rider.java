package com.zipcodewilmington.froilansfarm;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/24/21 5:05 PM
 */
public interface Rider {
    default void mount(Rideable rideable) {
        rideable.setRider(this);
    }

    default void dismount(Rideable rideable) {
        rideable.setRider(null);
    }
}
