package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.containers.Container;
import com.zipcodewilmington.froilansfarm.containers.FarmInterface;
import com.zipcodewilmington.froilansfarm.produce.CropInterface;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/27/21 12:10 AM
 */
public class Tractor extends AbstractVehicle implements FarmVehicleInterface {
    private Container<CropInterface<?>> harvestedCrops;

    public Tractor(Container<CropInterface<?>> harvestedCrops) {
        this.harvestedCrops = harvestedCrops;
    }

    public Tractor() {
        this(new Container<>());
    }

    @Override
    public String getNoise() {
        return "whir!";
    }

    @Override
    public void operate(FarmInterface farm) {
        farm
                .getField()
                .getAll()
                .forEach(cropRow -> cropRow
                        .getAll()
                        .forEach(crop -> {
                            crop.harvest();
                            harvestedCrops.add(crop);
                        }));
    }
}
