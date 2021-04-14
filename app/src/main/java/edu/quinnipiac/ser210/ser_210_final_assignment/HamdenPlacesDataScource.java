package edu.quinnipiac.ser210.ser_210_final_assignment;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class HamdenPlacesDataScource {

    // Database fields
    private SQLiteDatabase database;
    private MySQLiteHelper dbHelper;
    private String[] allGasStationColumns = {
            MySQLiteHelper.COLUMN_ID,
            MySQLiteHelper.COLUMN_NAME,
            MySQLiteHelper.COLUMN_LOCATION,
            MySQLiteHelper.COLUMN_TIMING,
            MySQLiteHelper.COLUMN_GAS_TYPE,
            MySQLiteHelper.COLUMN_RATING };

    public HamdenPlacesDataScource(Context context) {
        dbHelper = new MySQLiteHelper(context);
    }

    public void open () throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public SQLiteDatabase getDatabase() {return database;}

    public void close() {
        dbHelper.close();
    }

    public LocationDetails createDetails(String name, String location, String timing, String gasType, String rating) {
        ContentValues values = new ContentValues();
        values.put(MySQLiteHelper.COLUMN_NAME, name);
        values.put(MySQLiteHelper.COLUMN_LOCATION, location);
        values.put(MySQLiteHelper.COLUMN_TIMING, timing);
        values.put(MySQLiteHelper.COLUMN_GAS_TYPE, gasType);
        values.put(MySQLiteHelper.COLUMN_RATING, rating);
        long insertID = database.insert(MySQLiteHelper.TABLE_GAS_STATIONS,null,values);
       // Cursor cursor = database.query()
        return null;
    }

}
