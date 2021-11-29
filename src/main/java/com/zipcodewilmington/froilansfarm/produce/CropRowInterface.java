package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.containers.ContainerInterface;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/24/21 5:06 PM
 */
public interface CropRowInterface<
        EdibleType extends Edible,
        CropType extends CropInterface<EdibleType>>
        extends ContainerInterface<CropType> {

    default void add(CropType crop) {
        getAll().add(crop);
    }
}
