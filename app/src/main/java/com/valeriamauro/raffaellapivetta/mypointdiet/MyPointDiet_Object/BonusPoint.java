package com.valeriamauro.raffaellapivetta.mypointdiet.MyPointDiet_Object;


import com.valeriamauro.raffaellapivetta.mypointdiet._MyPointDiet.MyBonusPoint;

import java.util.Date;


public class BonusPoint implements MyBonusPoint {

    private String keyBonusPoint;
    private Date lastSaved;
    private Float pointSaved;

    @Override
    public String getKeyBonusPoint() {
        return keyBonusPoint;
    }

    @Override
    public Date getLastUpdate() {
        return lastSaved;
    }

    @Override
    public Float getPointSaved() {
        return pointSaved;
    }

    @Override
    public void setKeyBonusPoint(String keybonusPoint) {
        this.keyBonusPoint = keybonusPoint;
    }

    @Override
    public void setMyLastUpdate(Date lastUpdate) {
        this.lastSaved = lastUpdate;
    }

    @Override
    public void setPointSaved(Float pointSaved) {
        this.pointSaved = pointSaved;
    }
}
