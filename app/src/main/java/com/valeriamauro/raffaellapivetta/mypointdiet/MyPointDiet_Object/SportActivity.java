package com.valeriamauro.raffaellapivetta.mypointdiet.MyPointDiet_Object;

import com.valeriamauro.raffaellapivetta.mypointdiet._MyPointDiet.MySportActivity;



public class SportActivity implements MySportActivity {

    private String keySport;
    private String typeSport;
    private Float durationSport;

    @Override
    public String getKeySport() {
        return keySport;
    }

    @Override
    public String getTypeSport() {
        return typeSport;
    }

    @Override
    public Float getDurationSport() {
        return durationSport;
    }

    @Override
    public void setKeySport(String keySport) {
        this.keySport=keySport;
    }

    @Override
    public void setTypeSport(String typeSport) {
        this.typeSport=typeSport;
    }

    @Override
    public void setDurationSport(Float durationSport) {
        this.durationSport=durationSport;
    }
}
