package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.produce.ProduceInterface;
import com.zipcodewilmington.froilansfarm.produce.CropInterface;
import com.zipcodewilmington.froilansfarm.produce.CropRowInterface;

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
