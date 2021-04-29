package edu.quinnipiac.ser210.ser_210_final_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        switch (OptionsActivity.placeTypeHolder) {
            case 0:
                if (OptionsFragment.optionsSelected == 1) {
                    //need to reference the database and make a query to retrieve info
                    TextView gasStationInfoText = (TextView) findViewById(R.id.info_text);
                    gasStationInfoText.setText("Name: " + MainActivity.dataSource.getAllGasStations().get(0).getGasName() + "\n" +
                            "Location: " + MainActivity.dataSource.getAllGasStations().get(0).getGasLocation() + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllGasStations().get(0).getGasTiming() + "\n" +
                            "Gas Type: " + MainActivity.dataSource.getAllGasStations().get(0).getGasType() + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllGasStations().get(0).getGasRating());
                    ImageView gasStationImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllGasStations().get(0).getGasImage(), "drawable", getPackageName());
                    gasStationImage.setImageResource(resID);
                } else if (OptionsFragment.optionsSelected == 2) {
                    TextView gasStationInfoText = (TextView) findViewById(R.id.info_text);
                    gasStationInfoText.setText("Name: " + MainActivity.dataSource.getAllGasStations().get(1).getGasName() + "\n" +
                            "Location: " + MainActivity.dataSource.getAllGasStations().get(1).getGasLocation() + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllGasStations().get(1).getGasTiming() + "\n" +
                            "Gas Type: " + MainActivity.dataSource.getAllGasStations().get(1).getGasType() + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllGasStations().get(1).getGasRating());
                    ImageView gasStationImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllGasStations().get(1).getGasImage(), "drawable", getPackageName());
                    gasStationImage.setImageResource(resID);
                } else if (OptionsFragment.optionsSelected == 3) {
                    TextView gasStationInfoText = (TextView) findViewById(R.id.info_text);
                    gasStationInfoText.setText("Name: " + MainActivity.dataSource.getAllGasStations().get(2).getGasName() + "\n" +
                            "Location: " + MainActivity.dataSource.getAllGasStations().get(2).getGasLocation() + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllGasStations().get(2).getGasTiming() + "\n" +
                            "Gas Type: " + MainActivity.dataSource.getAllGasStations().get(2).getGasType() + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllGasStations().get(2).getGasRating());
                    ImageView gasStationImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllGasStations().get(2).getGasImage(), "drawable", getPackageName());
                    gasStationImage.setImageResource(resID);
                } else if (OptionsFragment.optionsSelected == 4) {
                    TextView gasStationInfoText = (TextView) findViewById(R.id.info_text);
                    gasStationInfoText.setText("Name: " + MainActivity.dataSource.getAllGasStations().get(3).getGasName() + "\n" +
                            "Location: " + MainActivity.dataSource.getAllGasStations().get(3).getGasLocation() + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllGasStations().get(3).getGasTiming() + "\n" +
                            "Gas Type: " + MainActivity.dataSource.getAllGasStations().get(3).getGasType() + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllGasStations().get(3).getGasRating());
                    ImageView gasStationImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllGasStations().get(3).getGasImage(), "drawable", getPackageName());
                    gasStationImage.setImageResource(resID);
                }
                break;
            case 1:
                if (OptionsFragment.optionsSelected == 1) {
                    TextView restaurantInfoText = (TextView) findViewById(R.id.info_text);
                    restaurantInfoText.setText("Name: " + MainActivity.dataSource.getAllRestaurants().get(0).getRestaurantName() + "\n" +
                            "Location: " + MainActivity.dataSource.getAllRestaurants().get(0).getRestaurantLocation() + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllRestaurants().get(0).getRestaurantTiming() + "\n" +
                            "Cuisine Type: " + MainActivity.dataSource.getAllRestaurants().get(0).getCuisineType() + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllRestaurants().get(0).getRestaurantRating());
                    ImageView restaurantImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllRestaurants().get(0).getRestaurantImage(), "drawable", getPackageName());
                    restaurantImage.setImageResource(resID);
                } else if (OptionsFragment.optionsSelected == 2) {
                    TextView restaurantInfoText = (TextView) findViewById(R.id.info_text);
                    restaurantInfoText.setText("Name: " + MainActivity.dataSource.getAllRestaurants().get(1).getRestaurantName() + "\n" +
                            "Location: " + MainActivity.dataSource.getAllRestaurants().get(1).getRestaurantLocation() + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllRestaurants().get(1).getRestaurantTiming() + "\n" +
                            "Cuisine Type: " + MainActivity.dataSource.getAllRestaurants().get(1).getCuisineType() + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllRestaurants().get(1).getRestaurantRating());
                    ImageView restaurantImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllRestaurants().get(1).getRestaurantImage(), "drawable", getPackageName());
                    restaurantImage.setImageResource(resID);
                } else if (OptionsFragment.optionsSelected == 3) {
                    TextView restaurantInfoText = (TextView) findViewById(R.id.info_text);
                    restaurantInfoText.setText("Name: " + MainActivity.dataSource.getAllRestaurants().get(2).getRestaurantName() + "\n" +
                            "Location: " + MainActivity.dataSource.getAllRestaurants().get(2).getRestaurantLocation() + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllRestaurants().get(2).getRestaurantTiming() + "\n" +
                            "Cuisine Type: " + MainActivity.dataSource.getAllRestaurants().get(2).getCuisineType() + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllRestaurants().get(2).getRestaurantRating());
                    ImageView restaurantImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllRestaurants().get(2).getRestaurantImage(), "drawable", getPackageName());
                    restaurantImage.setImageResource(resID);
                } else if (OptionsFragment.optionsSelected == 4) {
                    TextView restaurantInfoText = (TextView) findViewById(R.id.info_text);
                    restaurantInfoText.setText("Name: " + MainActivity.dataSource.getAllRestaurants().get(3).getRestaurantName() + "\n" +
                            "Location: " + MainActivity.dataSource.getAllRestaurants().get(3).getRestaurantLocation() + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllRestaurants().get(3).getRestaurantTiming() + "\n" +
                            "Cuisine Type: " + MainActivity.dataSource.getAllRestaurants().get(3).getCuisineType() + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllRestaurants().get(3).getRestaurantRating());
                    ImageView restaurantImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllRestaurants().get(3).getRestaurantImage(), "drawable", getPackageName());
                    restaurantImage.setImageResource(resID);
                }
                break;
            case 2:
                if (OptionsFragment.optionsSelected == 1) {
                    TextView parkInfoText = (TextView) findViewById(R.id.info_text);
                    parkInfoText.setText("Name: " + MainActivity.dataSource.getAllParks().get(0).getParkName() + "\n" +
                            "Location: " + MainActivity.dataSource.getAllParks().get(0).getParkLocation() + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllParks().get(0).getParkTiming() + "\n" +
                            "Attractions: " + MainActivity.dataSource.getAllParks().get(0).getAttractions() + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllParks().get(0).getParkRating());
                    ImageView parkImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllParks().get(0).getParkImage(), "drawable", getPackageName());
                    parkImage.setImageResource(resID);
                } else if (OptionsFragment.optionsSelected == 2) {
                    TextView parkInfoText = (TextView) findViewById(R.id.info_text);
                    parkInfoText.setText("Name: " + MainActivity.dataSource.getAllParks().get(1).getParkName() + "\n" +
                            "Location: " + MainActivity.dataSource.getAllParks().get(1).getParkLocation() + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllParks().get(1).getParkTiming() + "\n" +
                            "Attractions: " + MainActivity.dataSource.getAllParks().get(1).getAttractions() + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllParks().get(1).getParkRating());
                    ImageView parkImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllParks().get(1).getParkImage(), "drawable", getPackageName());
                    parkImage.setImageResource(resID);
                } else if (OptionsFragment.optionsSelected == 3) {
                    TextView parkInfoText = (TextView) findViewById(R.id.info_text);
                    parkInfoText.setText("Name: " + MainActivity.dataSource.getAllParks().get(2).getParkName() + "\n" +
                            "Location: " + MainActivity.dataSource.getAllParks().get(2).getParkLocation() + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllParks().get(2).getParkTiming() + "\n" +
                            "Attractions: " + MainActivity.dataSource.getAllParks().get(2).getAttractions() + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllParks().get(2).getParkRating());
                    ImageView parkImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllParks().get(2).getParkImage(), "drawable", getPackageName());
                    parkImage.setImageResource(resID);
                } else if (OptionsFragment.optionsSelected == 4) {
                    TextView parkInfoText = (TextView) findViewById(R.id.info_text);
                    parkInfoText.setText("Name: " + MainActivity.dataSource.getAllParks().get(3).getParkName() + "\n" +
                            "Location: " + MainActivity.dataSource.getAllParks().get(3).getParkLocation() + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllParks().get(3).getParkTiming() + "\n" +
                            "Attractions: " + MainActivity.dataSource.getAllParks().get(3).getAttractions() + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllParks().get(3).getParkRating());
                    ImageView parkImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllParks().get(3).getParkImage(), "drawable", getPackageName());
                    parkImage.setImageResource(resID);
                }
                break;
        }
    }
}