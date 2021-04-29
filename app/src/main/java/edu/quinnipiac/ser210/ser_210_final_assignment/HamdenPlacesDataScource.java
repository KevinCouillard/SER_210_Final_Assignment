package edu.quinnipiac.ser210.ser_210_final_assignment;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;

public class HamdenPlacesDataScource {

    // Database fields
    private SQLiteDatabase database;
    private MySQLiteHelper dbHelper;

    private String[] allGasStationColumns = {
            MySQLiteHelper.COLUMN_GAS_ID,
            MySQLiteHelper.COLUMN_GAS_NAME,
            MySQLiteHelper.COLUMN_GAS_LOCATION,
            MySQLiteHelper.COLUMN_GAS_TIMING,
            MySQLiteHelper.COLUMN_GAS_TYPE,
            MySQLiteHelper.COLUMN_GAS_RATING,
            MySQLiteHelper.COLUMN_GAS_IMAGE };

    private String[] allRestaurantColumns = {
            MySQLiteHelper.COLUMN_RESTAURANT_ID,
            MySQLiteHelper.COLUMN_RESTAURANT_NAME,
            MySQLiteHelper.COLUMN_RESTAURANT_LOCATION,
            MySQLiteHelper.COLUMN_RESTAURANT_TIMING,
            MySQLiteHelper.COLUMN_CUISINE_TYPE,
            MySQLiteHelper.COLUMN_RESTAURANT_RATING,
            MySQLiteHelper.COLUMN_RESTAURANT_IMAGE };

    private String[] allParkColumns = {
            MySQLiteHelper.COLUMN_PARK_ID,
            MySQLiteHelper.COLUMN_PARK_NAME,
            MySQLiteHelper.COLUMN_PARK_LOCATION,
            MySQLiteHelper.COLUMN_PARK_TIMING,
            MySQLiteHelper.COLUMN_ATTRACTIONS,
            MySQLiteHelper.COLUMN_PARK_RATING,
            MySQLiteHelper.COLUMN_PARK_IMAGE };

    public HamdenPlacesDataScource(Context context) {
        dbHelper = new MySQLiteHelper(context);
    }

    public void open () throws SQLException {
        database = dbHelper.getWritableDatabase();
        dbHelper.onUpgrade(database,1,2);
    }

    public SQLiteDatabase getDatabase() {return database;}

    public void close() {
        dbHelper.close();
    }

    public GasStation createGasDetails(String name, String location, String timing, String gasType, String rating, String image) {
        ContentValues values = new ContentValues();
        values.put(MySQLiteHelper.COLUMN_GAS_NAME, name);
        values.put(MySQLiteHelper.COLUMN_GAS_LOCATION, location);
        values.put(MySQLiteHelper.COLUMN_GAS_TIMING, timing);
        values.put(MySQLiteHelper.COLUMN_GAS_TYPE, gasType);
        values.put(MySQLiteHelper.COLUMN_GAS_RATING, rating);
        values.put(MySQLiteHelper.COLUMN_GAS_IMAGE, image);
        long insertID = database.insert(MySQLiteHelper.TABLE_GAS_STATIONS,null,values);
        Cursor cursor = database.query(MySQLiteHelper.TABLE_GAS_STATIONS,allGasStationColumns,MySQLiteHelper.COLUMN_GAS_ID + " = " + insertID,null,null,null,null);
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
        newGasStation.setGasId(cursor.getLong(0));
        newGasStation.setGasName(cursor.getString(1));
        newGasStation.setGasLocation(cursor.getString(2));
        newGasStation.setGasTiming(cursor.getString(3));
        newGasStation.setGasType(cursor.getString(4));
        newGasStation.setGasRating(cursor.getDouble(5));
        newGasStation.setGasImage(cursor.getString(6));
        return newGasStation;
    }

    public Restaurant createRestaurantDetails(String name, String location, String timing, String cuisineType, String rating, String image) {
        ContentValues values = new ContentValues();
        values.put(MySQLiteHelper.COLUMN_RESTAURANT_NAME, name);
        values.put(MySQLiteHelper.COLUMN_RESTAURANT_LOCATION, location);
        values.put(MySQLiteHelper.COLUMN_RESTAURANT_TIMING, timing);
        values.put(MySQLiteHelper.COLUMN_CUISINE_TYPE, cuisineType);
        values.put(MySQLiteHelper.COLUMN_RESTAURANT_RATING, rating);
        values.put(MySQLiteHelper.COLUMN_RESTAURANT_IMAGE, image);
        long insertID = database.insert(MySQLiteHelper.TABLE_RESTAURANTS,null,values);
        Cursor cursor = database.query(MySQLiteHelper.TABLE_RESTAURANTS,allRestaurantColumns,MySQLiteHelper.COLUMN_RESTAURANT_ID + " = " + insertID,null,null,null,null);
        cursor.moveToFirst();
        Restaurant newRestaurant = cursorToRestaurant(cursor);
        cursor.close();
        return newRestaurant;
    }

    public List<Restaurant> getAllRestaurants() {
        List<Restaurant> restaurants = new ArrayList<Restaurant>();
        Cursor cursor = database.query(MySQLiteHelper.TABLE_RESTAURANTS,allRestaurantColumns,null,null,null,null,null);
        cursor.moveToFirst();
        while(! cursor.isAfterLast()) {
            Restaurant restaurant = cursorToRestaurant(cursor);
            restaurants.add(restaurant);
            cursor.moveToNext();
        }
        cursor.close();
        return restaurants;
    }

    public Restaurant cursorToRestaurant(Cursor cursor) {
        Restaurant newRestaurant = new Restaurant();
        newRestaurant.setRestaurantId(cursor.getLong(0));
        newRestaurant.setRestaurantName(cursor.getString(1));
        newRestaurant.setRestaurantLocation(cursor.getString(2));
        newRestaurant.setRestaurantTiming(cursor.getString(3));
        newRestaurant.setCuisineType(cursor.getString(4));
        newRestaurant.setRestaurantRating(cursor.getDouble(5));
        newRestaurant.setRestaurantImage(cursor.getString(6));
        return newRestaurant;
    }

    public Park createParkDetails(String name, String location, String timing, String attractions, String rating, String image) {
        ContentValues values = new ContentValues();
        values.put(MySQLiteHelper.COLUMN_PARK_NAME, name);
        values.put(MySQLiteHelper.COLUMN_PARK_LOCATION, location);
        values.put(MySQLiteHelper.COLUMN_PARK_TIMING, timing);
        values.put(MySQLiteHelper.COLUMN_ATTRACTIONS, attractions);
        values.put(MySQLiteHelper.COLUMN_PARK_RATING, rating);
        values.put(MySQLiteHelper.COLUMN_PARK_IMAGE, image);
        long insertID = database.insert(MySQLiteHelper.TABLE_PARKS,null,values);
        Cursor cursor = database.query(MySQLiteHelper.TABLE_PARKS,allParkColumns,MySQLiteHelper.COLUMN_PARK_ID + " = " + insertID,null,null,null,null);
        cursor.moveToFirst();
        Park newPark = cursorToPark(cursor);
        cursor.close();
        return newPark;
    }

    public List<Park> getAllParks() {
        List<Park> parks = new ArrayList<Park>();
        Cursor cursor = database.query(MySQLiteHelper.TABLE_PARKS,allParkColumns,null,null,null,null,null);
        cursor.moveToFirst();
        while(! cursor.isAfterLast()) {
            Park park = cursorToPark(cursor);
            parks.add(park);
            cursor.moveToNext();
        }
        cursor.close();
        return parks;
    }

    public Park cursorToPark(Cursor cursor) {
        Park newPark = new Park();
        newPark.setParkId(cursor.getLong(0));
        newPark.setParkName(cursor.getString(1));
        newPark.setParkLocation(cursor.getString(2));
        newPark.setParkTiming(cursor.getString(3));
        newPark.setAttractions(cursor.getString(4));
        newPark.setParkRating(cursor.getDouble(5));
        newPark.setParkImage(cursor.getString(6));
        return newPark;
    }


}
