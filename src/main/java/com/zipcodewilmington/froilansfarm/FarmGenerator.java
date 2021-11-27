package com.zipcodewilmington.froilansfarm;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/26/21 11:34 PM
 */
public class FarmGenerator {
    private static Farm createDefault() {
        // populate farm
        Farm farm = new FarmBuilder()
                .setFarmHouse(new FarmHouse())
                .setGarage(new Container<>(
                        new CropDuster(),
                        new Tractor()
                ))
                .setCoops(new Container<>(Stream
                        .generate(ChickenCoop::new)
                        .limit(4)
                        .collect(Collectors.toList())
                ))
                .setStables(new Container<>(Stream
                        .generate(Stable::new)
                        .limit(3)
                        .collect(Collectors.toList())
                ))
                .setField(new Field(new Container<>(
                        new CropRow<EarCorn, CornStalk>(),
                        new CropRow<Tomato, TomatoPlant>(),
                        new CropRow<EarCorn, CornStalk>(),
                        new CropRow<Tomato, TomatoPlant>(),
                        new CropRow<EarCorn, CornStalk>())
                ))
                .createFarm();

        // populate stables with 10 horses
        farm
                .getStables()
                .getAll()
                .forEach(stable -> Stream
                        .generate(Horse::new)
                        .limit(3)
                        .forEach(stable::add));
        farm
                .getStables()
                .getAll()
                .stream()
                .findAny()
                .get()
                .add(new Horse());

        // populate coops with 15 chickens
        farm
                .getCoops()
                .getAll()
                .forEach(coop -> Stream
                        .generate(Chicken::new)
                        .limit(4)
                        .forEach(coop::add));
        farm
                .getCoops()
                .getAll()
                .stream()
                .findAny()
                .get()
                .removeAny();

        return farm;
    }

}
