package com.zipcodewilmington.froilansfarm.containers;

import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/24/21 5:45 PM
 */
public interface ContainerInterface<SomeType> {
    List<SomeType> getAll();

    default void add(SomeType someObject) {
        getAll().add(someObject);
    }

    default SomeType removeAny() {
        SomeType objectToRemove = getAll().stream().findAny().get();
        remove(objectToRemove);
        return objectToRemove;
    }

    default void remove(SomeType someObject) {
        getAll().remove(someObject);
    }

    default boolean contains(SomeType someObject) {
        return getAll().contains(someObject);
    }

    default void purge() {
        getAll().clear();
    }
}
