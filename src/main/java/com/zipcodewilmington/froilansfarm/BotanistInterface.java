package com.zipcodewilmington.froilansfarm;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/24/21 5:05 PM
 */
public interface BotanistInterface {
    default void plant(CropInterface crop, CropRowInterface cropRow) {
        cropRow.add(crop);
    }
}
