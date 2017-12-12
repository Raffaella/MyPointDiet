package com.valeriamauro.raffaellapivetta.mypointdiet._MyPointDiet;

import java.util.Date;

public interface MyBonusPoint {

    String getKeyBonusPoint();
    Date getLastUpdate();
    Float getPointSaved(); //max 10 p by day
    void setKeyBonusPoint(String keybonusPoint);
    void setMyLastUpdate(Date lastUpdate);
    void setPointSaved(Float pointSaved);
}
