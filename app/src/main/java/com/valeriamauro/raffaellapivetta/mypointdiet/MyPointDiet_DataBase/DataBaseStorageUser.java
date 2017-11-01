package com.valeriamauro.raffaellapivetta.mypointdiet.MyPointDiet_DataBase;

/**
 * Created by raffaella.pivetta on 31/10/2017.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import android.util.Log;

/**This class is responsible for creating the database.
 * SQLiteDatabase is the base class for working with a SQLite database in Android and
 * provides methods to open, query, update and close the database.
 * More specifically SQLiteDatabase provides the insert(), update() and delete() methods.
 * In addition it provides the execSQL() method, which allows to execute SQL directly.*/

public class DataBaseStorageUser extends SQLiteOpenHelper {

    static final String TABLE_USER= "User";

    static final String COLUMN_ID="id";
    static final String COLUMN_NAME="name";
    static final String COLUMN_SURNAME="surname";
    static final String COLUMN_POINT="point";
    static final String COLUMN_AGE ="age";

    // shared index, make sure to match COLUMNS
    static final int COLUMN_ID_INDEX=0;
    static final int COLUMN_NAME_INDEX=1;
    static final int COLUMN_SURNAME_INDEX=2;
    static final int COLUMN_POINT_INDEX=3;
    static final int COLUMN_AGE_INDEX=4;

    /** this is the version of DB.
     *  we must increase this number when the DB  is change **/
    private  static  final  int DATABASE_VERSION =  1;

    /** this's the DB's name**/
    private static final String DATABASE_NAME= "User.db";

    /** this 's the query that we use for create the table
     *  Android use the _id  for identify the element's key **/
    private static final String DATABASE_CREATE = "create table" + TABLE_USER + "("
            + COLUMN_ID + " _id vachar(45) PRIMARY KEY, "
            + COLUMN_NAME + " vachar(15) NOT NULL,"
            + COLUMN_SURNAME + " vachar(15) NOT NULL,"
            //TODO POINT non � un vachar devo vedere come si fa con gli interi
            + COLUMN_POINT + " vachar(6) NOT NULL,"
            + COLUMN_AGE + " vachar(6) NOT NULL,"
            + ");";

    public DataBaseStorageUser(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**with this method we create the table. onCreate(---) is called when we created DB for the first time
     * or better when the application is just installed **/
    @Override
    public void onCreate(SQLiteDatabase db) {
		/*we use execSQL(---) if we want execute SQL's code*/
        db.execSQL(DATABASE_CREATE);
    }

    /** this method in called when DB just exist but, the when the number version is absolutely.
            * Usually it's called when the number Version of an application just exist is changed
            * This method allows you to update the database schema.**/
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(DataBaseStorageUser.class.getName(),"Upgrading database from version " + oldVersion
                + "to" + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_USER);
        onCreate(db);
    }
}
