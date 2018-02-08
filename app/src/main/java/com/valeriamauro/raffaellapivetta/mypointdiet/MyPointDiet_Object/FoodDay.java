package com.valeriamauro.raffaellapivetta.mypointdiet.MyPointDiet_Object;

import com.valeriamauro.raffaellapivetta.mypointdiet._MyPointDiet.MyFoodDay;

/**
 * Created by Raffaella on 12/12/2017.
 */

public class FoodDay implements MyFoodDay {

    private String keyFoodDay;
    private String nameFoodDay;
    private Float quantityFoodDay;
    private String misureFoodDay;
    private String typeFoodDay;
    private Float pointFoodDay;

    @Override
    public String getKeyFoodDay() {
        return keyFoodDay;
    }

    @Override
    public String getNameFoodDay() {
        return nameFoodDay;
    }

    @Override
    public Float getQuantityFoodDay() {
        return quantityFoodDay;
    }

    @Override
    public String getMisureFoodDay() {
        return misureFoodDay;
    }

    @Override
    public String getTypeFoodDay() {
        return typeFoodDay;
    }

    @Override
    public Float getPointFoodDay() {
        return pointFoodDay;
    }

    @Override
    public void setKeyFoodDay(String keyFoodDay) {
        this.keyFoodDay=keyFoodDay;
    }

    @Override
    public void setNameFoodDay(String nameFoodDay) {
        this.nameFoodDay=nameFoodDay;
    }

    @Override
    public void setQuantityFoodDay(Float quantityFoodDay) {
        this.quantityFoodDay=quantityFoodDay;
    }

    @Override
    public void setMisureFoodDay(String misureFoodDay) {
        this.misureFoodDay=misureFoodDay;
    }

    @Override
    public void setTypeFoodDay(String typeFoodDay) {
        this.typeFoodDay=typeFoodDay;
    }

    @Override
    public void setPointFoodDay(Float pointFoodDay) {
        this.pointFoodDay=pointFoodDay;
    }
}
