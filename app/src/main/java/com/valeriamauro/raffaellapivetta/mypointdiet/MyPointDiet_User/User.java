package com.valeriamauro.raffaellapivetta.mypointdiet.MyPointDiet_User;

import com.valeriamauro.raffaellapivetta.mypointdiet._MyPointDiet.MyUser;

import java.util.Date;
import android.content.Context;

/**
 * Created by raffaella.pivetta on 31/10/2017.
 */

public class User implements MyUser {

    private String keyUser;
    private String nameUser;
    private String surnameUser;
    private Date birthdayUser;
    private int ageUser;
    private int pointUser;
    private Context c;

    @Override
    public String getKeyUser() {
        return keyUser;
    }

    @Override
    public String getNameUser() {
        return nameUser;
    }

    @Override
    public String getSurnameUser() {
        return surnameUser;
    }

    @Override
    public Date getBirthdayUser() {
        return birthdayUser;
    }

    @Override
    public int getAge() {
        return ageUser;
    }

    @Override
    public int getPoint() {
        return pointUser;
    }

    @Override
    public void setKeyUser(String keyUser) {
        this.keyUser = keyUser;
    }

    @Override
    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    @Override
    public void setSurnameUser(String surnameUser) {
        this.surnameUser = nameUser;
    }

    @Override
    public void setBirthdayUser(Date birthdayUser) {
        this.birthdayUser = birthdayUser;
    }

    @Override
    public void setAge(Date birthdayUser) {
        this.ageUser = ageUser;
    }

    @Override
    public void setPoint(int pointUser) {
        this.pointUser = pointUser;
    }
}
