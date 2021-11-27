package com.zipcodewilmington.froilansfarm;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/24/21 5:11 PM
 */
public interface CropDusterInterface extends FarmVehicleInterface, AircraftInterface {
    default void fertilize(CropRowInterface<Edible, CropInterface<Edible>> cropRow) {
        cropRow.getAll().forEach(ProduceInterface::fertilize);
    }
}
