package com.zipcodewilmington.froilansfarm;

import javafx.geometry.Point3D;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/26/21 11:58 PM
 */
public class CropDuster extends AbstractVehicle implements CropDusterInterface {
    private Point3D location;

    @Override
    public void operate(FarmInterface farm) {
        farm
                .getField()
                .getAll()
                .forEach(cropRow -> cropRow
                        .getAll()
                        .forEach(ProduceInterface::fertilize));
    }

    @Override
    public void fly(Integer xPosition, Integer yPosition, Integer zPosition) {
        this.location = new Point3D(xPosition, yPosition, zPosition);
    }

    @Override
    public String getNoise() {
        return "Whoosh!";
    }
}
