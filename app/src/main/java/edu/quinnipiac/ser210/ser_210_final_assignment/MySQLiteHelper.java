package edu.quinnipiac.ser210.ser_210_final_assignment;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.ImageView;

public class MySQLiteHelper extends SQLiteOpenHelper {

    public static final String TABLE_GAS_STATIONS = "GasStations";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_LOCATION = "location";
    public static final String COLUMN_TIMING = "timing";
    public static final String COLUMN_GAS_TYPE = "gasType";
    public static final String COLUMN_RATING = "rating";
    public static final String COLUMN_IMAGE = "image";

    public static final String DATABASE_NAME = "HamdenPlaces";
    private static final int DATABASE_VERSION = 1;

    // Database creation sql statement
    private static final String DATABASE_CREATE = "create table "
            + TABLE_GAS_STATIONS + "(" + COLUMN_ID
            + " integer primary key autoincrement, " + COLUMN_NAME
            + " text not null, " + COLUMN_LOCATION + " text, "
            + COLUMN_TIMING + " text, " + COLUMN_GAS_TYPE
            + " text, " + COLUMN_RATING + " double, " + COLUMN_IMAGE + " text);";

    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(MySQLiteHelper.class.getName(),
                "Upgrading database from version " + oldVersion + " to "
                    + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_GAS_STATIONS);
        onCreate(db);
    }
}
