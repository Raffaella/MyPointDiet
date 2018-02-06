package com.valeriamauro.raffaellapivetta.mypointdiet.MyPointDiet_Object;

import com.valeriamauro.raffaellapivetta.mypointdiet._MyPointDiet.MyRecipe;

/**
 * Created by Raffaella.Pivetta on 06/02/2018.
 */

public class Recipe implements MyRecipe {

    private String keyRecipe;
    private String nameRecipe;

    @Override
    public String getKeyRecipe() {
        return keyRecipe;
    }

    @Override
    public String getNameRecipe() {
        return nameRecipe;
    }

    @Override
    public void setKeyRecipe(String keyRecipe) {
        this.keyRecipe=keyRecipe;
    }

    @Override
    public void setNameRecipe(String nameRecipe) {
        this.nameRecipe=nameRecipe;
    }
}
