package com.valeriamauro.raffaellapivetta.mypointdiet.MyPointDiet_Object;

import com.valeriamauro.raffaellapivetta.mypointdiet._MyPointDiet.MyUser;

import java.util.Date;

/**
 * Created by Raffaella on 12/12/2017.
 */

public class User implements MyUser {

    private String keyUser;
    private String nameUser;
    private Date birthdayUser;
    private Float weightUser;
    private Float hightUser;
    private String sexUser;
    private Float pointUser;


    @Override
    public String getKeyUser() {
        return keyUser;
    }

    @Override
    public String getNameUser() {
        return nameUser;
    }

    @Override
    public Date getBirthdayUser() {
        return birthdayUser;
    }

    @Override
    public Float getWeightUser() {
        return weightUser;
    }

    @Override
    public Float getHightUser() {
        return hightUser;
    }

    @Override
    public String getSexUsexUser() {
        return sexUser;
    }

    @Override
    public Float getPointUser() {
        return pointUser;
    }

    @Override
    public void setKeyUser(String keyUser) {
        this.keyUser=keyUser;
    }

    @Override
    public void setNameUser(String nameUser) {
        this.nameUser=nameUser;
    }

    @Override
    public void setBirthdayUser(Date birthdayUser) {
        this.birthdayUser=birthdayUser;
    }

    @Override
    public void setWeightUser(Float weightUser) {
        this.weightUser=weightUser;
    }

    @Override
    public void setHightUser(Float hightUser) {
        this.hightUser=hightUser;
    }

    @Override
    public void setSexUsexUser(String sexUser) {
        this.sexUser=sexUser;
    }

    @Override
    public void setPointUser(Float pointUser) {
        this.pointUser=pointUser;
    }
}
