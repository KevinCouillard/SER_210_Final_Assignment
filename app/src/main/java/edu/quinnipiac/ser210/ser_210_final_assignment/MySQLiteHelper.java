package edu.quinnipiac.ser210.ser_210_final_assignment;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.ImageView;
/**
 * Kevin Couillard & Hephzibah Rajan
 * SER210 Final Assignment
 * Hamden Places SQLiteHelper Class
 * 4/29/21
 */
public class MySQLiteHelper extends SQLiteOpenHelper {

    //initializing the tables & columns as strings
    public static final String TABLE_GAS_STATIONS = "GasStations";
    public static final String COLUMN_GAS_ID = "_id";
    public static final String COLUMN_GAS_NAME = "name";
    public static final String COLUMN_GAS_LOCATION = "location";
    public static final String COLUMN_GAS_TIMING = "timing";
    public static final String COLUMN_GAS_TYPE = "gasType";
    public static final String COLUMN_GAS_RATING = "rating";
    public static final String COLUMN_GAS_IMAGE = "image";

    public static final String TABLE_RESTAURANTS = "Restaurants";
    public static final String COLUMN_RESTAURANT_ID = "_id";
    public static final String COLUMN_RESTAURANT_NAME = "name";
    public static final String COLUMN_RESTAURANT_LOCATION = "location";
    public static final String COLUMN_RESTAURANT_TIMING = "timing";
    public static final String COLUMN_CUISINE_TYPE = "cuisineType";
    public static final String COLUMN_RESTAURANT_RATING = "rating";
    public static final String COLUMN_RESTAURANT_IMAGE = "image";

    public static final String TABLE_PARKS = "Parks";
    public static final String COLUMN_PARK_ID = "_id";
    public static final String COLUMN_PARK_NAME = "name";
    public static final String COLUMN_PARK_LOCATION = "location";
    public static final String COLUMN_PARK_TIMING = "timing";
    public static final String COLUMN_ATTRACTIONS = "attractions";
    public static final String COLUMN_PARK_RATING = "rating";
    public static final String COLUMN_PARK_IMAGE = "image";

    //initializing the database name as a string & the version as an int
    public static final String DATABASE_NAME = "HamdenPlaces";
    private static final int DATABASE_VERSION = 1;

    // Database table creation sql statements
    private static final String GAS_STATION_TABLE_CREATE = "create table "
            + TABLE_GAS_STATIONS + "(" + COLUMN_GAS_ID
            + " integer primary key autoincrement, " + COLUMN_GAS_NAME
            + " text not null, " + COLUMN_GAS_LOCATION + " text, "
            + COLUMN_GAS_TIMING + " text, " + COLUMN_GAS_TYPE
            + " text, " + COLUMN_GAS_RATING + " double, " + COLUMN_GAS_IMAGE + " text);";

    private static final String RESTAURANT_TABLE_CREATE = "create table "
            + TABLE_RESTAURANTS + "(" + COLUMN_RESTAURANT_ID
            + " integer primary key autoincrement, " + COLUMN_RESTAURANT_NAME
            + " text not null, " + COLUMN_RESTAURANT_LOCATION + " text, "
            + COLUMN_RESTAURANT_TIMING + " text, " + COLUMN_CUISINE_TYPE
            + " text, " + COLUMN_RESTAURANT_RATING + " double, " + COLUMN_RESTAURANT_IMAGE + " text);";

    private static final String PARK_TABLE_CREATE = "create table "
            + TABLE_PARKS + "(" + COLUMN_PARK_ID
            + " integer primary key autoincrement, " + COLUMN_PARK_NAME
            + " text not null, " + COLUMN_PARK_LOCATION + " text, "
            + COLUMN_PARK_TIMING + " text, " + COLUMN_ATTRACTIONS
            + " text, " + COLUMN_PARK_RATING + " double, " + COLUMN_PARK_IMAGE + " text);";

    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //executes the sql table create statements adding the tables to the database
        db.execSQL(GAS_STATION_TABLE_CREATE);
        db.execSQL(RESTAURANT_TABLE_CREATE);
        db.execSQL(PARK_TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //upgrades the database version
        Log.w(MySQLiteHelper.class.getName(),
                "Upgrading database from version " + oldVersion + " to "
                    + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_GAS_STATIONS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_RESTAURANTS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PARKS);
        onCreate(db);
    }
}
