package com.zipcodewilmington.froilansfarm.containers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/24/21 5:52 PM
 */
public class Container<SomeType> implements ContainerInterface<SomeType> {
    private List<SomeType> list;

    public Container() {
        this(new ArrayList<>());
    }

    public Container(List<SomeType> list) {
        this.list = list;
    }

    public Container(SomeType... array) {
        this(new ArrayList<>(Arrays.asList(array)));
    }

    @Override
    public List<SomeType> getAll() {
        return this.list;
    }
}
