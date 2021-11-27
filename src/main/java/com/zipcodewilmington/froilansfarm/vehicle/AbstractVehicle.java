package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.Rider;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/27/21 12:06 AM
 */
abstract public class AbstractVehicle implements VehicleInterface {
    private Rider rider;

    @Override
    public void setRider(Rider rider) {
        this.rider = rider;
    }

    @Override
    public Rider getRider() {
        return rider;
    }
}
