package com.zipcodewilmington.froilansfarm.produce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/26/21 11:43 PM
 */
public class CropRow<
        EdibleType extends Edible,
        CropType extends CropInterface<EdibleType>>
        implements CropRowInterface<EdibleType, CropType> {
    private List<CropType> cropRow;

    public CropRow(List<CropType> cropRow) {
        this.cropRow = cropRow;
    }

    public CropRow(CropType... cropRow) {
        this(new ArrayList<>(Arrays.asList(cropRow)));
    }

    public CropRow() {
        this(new ArrayList<>());
    }

    @Override
    public List<CropType> getAll() {
        return cropRow;
    }
}
