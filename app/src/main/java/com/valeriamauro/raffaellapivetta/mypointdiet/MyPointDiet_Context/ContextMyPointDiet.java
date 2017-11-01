package com.valeriamauro.raffaellapivetta.mypointdiet.MyPointDiet_Context;

import android.content.Context;

/**
 * Created by raffaella.pivetta on 31/10/2017.
 */

public class ContextMyPointDiet {

    private static ContextMyPointDiet istanz=null;
    private Context c;

    private ContextMyPointDiet(){}

    /**the only access point to the class to the outside world comes through the static method getInstance ().
     * this method takes care of restoring (creating it first if it has never been created)
     * the only instance of the class.**/
    public static synchronized ContextMyPointDiet getIstance(){
        if(istanz == null){
            istanz = new ContextMyPointDiet();
        }
        return istanz;
    }

    public Context getContext(){
        return c;
    }

    public void setContext(Context c){
        this.c=c;
    }

}
