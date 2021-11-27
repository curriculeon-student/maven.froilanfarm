package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.produce.CropRowInterface;

import java.util.Arrays;
import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/24/21 5:06 PM
 */
public interface FieldInterface {
    default void store(CropRowInterface cropRow) {
        getCropRows().add(cropRow);
    }

    default void store(CropRowInterface... cropRows) {
        store(Arrays.asList(cropRows));
    }

    default void store(List<CropRowInterface> asList) {
        getCropRows().forEach(this::store);
    }

    List<CropRowInterface> getCropRows();
}
