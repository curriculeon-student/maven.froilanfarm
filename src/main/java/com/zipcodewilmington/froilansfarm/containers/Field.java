package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.produce.CropRowInterface;

import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/26/21 11:27 PM
 */
public class Field {
    private Container<CropRowInterface<?, ?>> land;

    public Field(Container<CropRowInterface<?, ?>> land) {
        this.land = land;
    }

    public Field() {
        this(new Container<>());
    }

    public Field plant(CropRowInterface<?, ?> cropRow) {
        land.add(cropRow);
        return this;
    }

    public List<CropRowInterface<?, ?>> getAll() {
        return land.getAll();
    }

    public CropRowInterface<?, ?> getCropRow(Integer rowNumber) {
        return land.getAll().get(rowNumber);
    }
}
