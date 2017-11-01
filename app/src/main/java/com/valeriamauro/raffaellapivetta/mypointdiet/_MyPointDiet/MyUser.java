package com.valeriamauro.raffaellapivetta.mypointdiet._MyPointDiet;

import java.util.Date;

/**
 * Created by raffaella.pivetta on 31/10/2017.
 */


public interface MyUser {

    String getKeyUser();
    String getNameUser();
    String getSurnameUser();
    Date getBirthdayUser();
    int getAge();
    int getPoint();
    void setKeyUser(String keyUser);
    void setNameUser(String nameUser);
    void setSurnameUser(String surnameUser);
    void setBirthdayUser(Date birthdayUser);
    void setAge(Date birthdayUser);
    void setPoint(int pointUser);


}
