package edu.quinnipiac.ser210.ser_210_final_assignment;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

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

    public GasStation createDetails(String name, String location, String timing, String gasType, String rating) {
        ContentValues values = new ContentValues();
        values.put(MySQLiteHelper.COLUMN_NAME, name);
        values.put(MySQLiteHelper.COLUMN_LOCATION, location);
        values.put(MySQLiteHelper.COLUMN_TIMING, timing);
        values.put(MySQLiteHelper.COLUMN_GAS_TYPE, gasType);
        values.put(MySQLiteHelper.COLUMN_RATING, rating);
        long insertID = database.insert(MySQLiteHelper.TABLE_GAS_STATIONS,null,values);
        Cursor cursor = database.query(MySQLiteHelper.TABLE_GAS_STATIONS,allGasStationColumns,MySQLiteHelper.COLUMN_ID + " = " + insertID,null,null,null,null);
        cursor.moveToFirst();
        GasStation newGasStation = cursorToGasStation(cursor);
        cursor.close();
        return newGasStation;
    }

    public List<GasStation> getAllGasStations() {
        List<GasStation> gasStations = new ArrayList<GasStation>();
        Cursor cursor = database.query(MySQLiteHelper.TABLE_GAS_STATIONS,allGasStationColumns,null,null,null,null,null);
        cursor.moveToFirst();
        while(! cursor.isAfterLast()) {
            GasStation gasStation = cursorToGasStation(cursor);
            gasStations.add(gasStation);
            cursor.moveToNext();
        }
        cursor.close();
        return gasStations;
    }

    public GasStation cursorToGasStation(Cursor cursor) {
        GasStation newGasStation = new GasStation();
        newGasStation.setId(cursor.getLong(0));
        newGasStation.setName(cursor.getString(1));
        newGasStation.setLocation(cursor.getString(2));
        newGasStation.setTiming(cursor.getString(3));
        newGasStation.setGasType(cursor.getString(4));
        newGasStation.setRating(cursor.getDouble(5));
        return newGasStation;
    }

}
