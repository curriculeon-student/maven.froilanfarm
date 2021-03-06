package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.containers.FarmInterface;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/24/21 5:12 PM
 */
public interface FarmVehicleInterface extends VehicleInterface {
    void operate(FarmInterface farm);
}
