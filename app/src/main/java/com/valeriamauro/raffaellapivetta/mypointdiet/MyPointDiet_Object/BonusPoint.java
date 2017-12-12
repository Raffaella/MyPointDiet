package com.valeriamauro.raffaellapivetta.mypointdiet.MyPointDiet_Object;

import com.valeriamauro.raffaellapivetta.mypointdiet._MyPointDiet.MyBonusPoint;

import java.util.Date;


public class BonusPoint implements MyBonusPoint {

    private Date lastSaved;
    private String PointSaved;

    @Override
    public String getKeyBonusPoint() {
        return null;
    }

    @Override
    public Date getLastUpdate() {
        return null;
    }

    @Override
    public Float getPointSaved() {
        return null;
    }

    @Override
    public void setKeyBonusPoint(String keybonusPoint) {

    }

    @Override
    public void setMyLastUpdate(Date lastUpdate) {

    }

    @Override
    public void setPointSaved(Float pointSaved) {

    }
}
