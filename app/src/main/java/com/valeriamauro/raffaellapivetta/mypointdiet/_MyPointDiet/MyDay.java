package com.valeriamauro.raffaellapivetta.mypointdiet._MyPointDiet;

import java.util.Date;

public interface MyDay {

    String getKeyDay();
    Date getDateDay();
    Float getWaterDay(); //null
    Float getWeightDay(); //null
    void setKeyDay(String keyDay);
    void setDate(Date dateDay);
    void setWaterDay(Float waterDay);
    void setWeightDay(Float weightDay);

}
