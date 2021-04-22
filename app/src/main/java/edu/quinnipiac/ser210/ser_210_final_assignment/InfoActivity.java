package edu.quinnipiac.ser210.ser_210_final_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class InfoActivity extends AppCompatActivity {
    private HamdenPlacesDataScource dataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        dataSource = new HamdenPlacesDataScource(this);
        dataSource.open();
        List<GasStation> allGasStations = dataSource.getAllGasStations();
        int optionSelected = this.getIntent().getExtras().getInt("optionSelected");

        GasStation gasStation = new GasStation();
        Restaurant restaurant = new Restaurant();
        Park park = new Park();
        switch (OptionsActivity.placeTypeHolder) {
            case 0:
                if (optionSelected == 1) {
                    String[] gasStationInfo = new String[]{"Hamden Ultra Sunoco",
                            "2440 Dixwell Ave",
                            "24 Hours Mon-Sun",
                            "87 octane regular, 89 octane plus, 91 octane premium, and 93 octane ultra",
                            "4.0",
                            "sunoco_image"};
                    gasStation = dataSource.createGasDetails(gasStationInfo[0], gasStationInfo[1], gasStationInfo[2], gasStationInfo[3], gasStationInfo[4], gasStationInfo[5]);
                    TextView gasStationInfoText = (TextView) findViewById(R.id.info_text);
                    gasStationInfoText.setText("Name: " + gasStation.getGasName() + "\n" +
                            "Location: " + gasStation.getGasLocation() + "\n" +
                            "Timing: " + gasStation.getGasTiming() + "\n" +
                            "Gas Type: " + gasStation.getGasType() + "\n" +
                            "Rating: " + gasStation.getGasRating());
                    ImageView gasStationImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(gasStation.getGasImage(), "drawable", InfoActivity.this.getPackageName());
                    gasStationImage.setImageResource(resID);
                } else if (optionSelected == 2) {
                    String[] gasStationInfo = new String[]{"7-Eleven",
                            "1795 Dixwell Ave",
                            "24 Hours Mon-Sun",
                            "87 octane regular, 89 octane plus, 91 octane premium",
                            "5.0",
                            "seven_eleven_image"};
                    gasStation = dataSource.createGasDetails(gasStationInfo[0], gasStationInfo[1], gasStationInfo[2], gasStationInfo[3], gasStationInfo[4], gasStationInfo[5]);
                    TextView gasStationInfoText = (TextView) findViewById(R.id.info_text);
                    gasStationInfoText.setText("Name: " + gasStation.getGasName() + "\n" +
                            "Location: " + gasStation.getGasLocation() + "\n" +
                            "Timing: " + gasStation.getGasTiming() + "\n" +
                            "Gas Type: " + gasStation.getGasType() + "\n" +
                            "Rating: " + gasStation.getGasRating());
                    ImageView gasStationImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(gasStation.getGasImage(), "drawable", InfoActivity.this.getPackageName());
                    gasStationImage.setImageResource(resID);
                } else if (optionSelected == 3) {
                    String[] gasStationInfo = new String[]{"Cumberland Farms",
                            "249 State St",
                            "24 Hours Mon-Sun",
                            "87 octane regular, 89 octane plus, 91 octane premium",
                            "3.5",
                            "cumberland_farms_image"};
                    gasStation = dataSource.createGasDetails(gasStationInfo[0], gasStationInfo[1], gasStationInfo[2], gasStationInfo[3], gasStationInfo[4], gasStationInfo[5]);
                    TextView gasStationInfoText = (TextView) findViewById(R.id.info_text);
                    gasStationInfoText.setText("Name: " + gasStation.getGasName() + "\n" +
                            "Location: " + gasStation.getGasLocation() + "\n" +
                            "Timing: " + gasStation.getGasTiming() + "\n" +
                            "Gas Type: " + gasStation.getGasType() + "\n" +
                            "Rating: " + gasStation.getGasRating());
                    ImageView gasStationImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(gasStation.getGasImage(), "drawable", InfoActivity.this.getPackageName());
                    gasStationImage.setImageResource(resID);
                } else if (optionSelected == 4) {
                    String[] gasStationInfo = new String[]{"Shea's Service Center",
                            "1182 Whitney Ave",
                            "7:00 AM - 5:30 PM Mon-Fri, 7:00 AM - 12:00 AM Sat",
                            "87 octane regular, 89 octane plus, 91 octane premium",
                            "5.0",
                            "sheas_service_center_image"};
                    gasStation = dataSource.createGasDetails(gasStationInfo[0], gasStationInfo[1], gasStationInfo[2], gasStationInfo[3], gasStationInfo[4], gasStationInfo[5]);
                    TextView gasStationInfoText = (TextView) findViewById(R.id.info_text);
                    gasStationInfoText.setText("Name: " + gasStation.getGasName() + "\n" +
                            "Location: " + gasStation.getGasLocation() + "\n" +
                            "Timing: " + gasStation.getGasTiming() + "\n" +
                            "Gas Type: " + gasStation.getGasType() + "\n" +
                            "Rating: " + gasStation.getGasRating());
                    ImageView gasStationImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(gasStation.getGasImage(), "drawable", InfoActivity.this.getPackageName());
                    gasStationImage.setImageResource(resID);
                }
                break;
            case 1:
                if (optionSelected == 1) {
                    String[] restaurantInfo = new String[]{"Mirko Depot",
                            "0 Depot Ave",
                            "4:00 PM - 10 PM Mon-Wed, 11:30 AM - 11:00 PM Thurs-Sat",
                            "Bar/Pub",
                            "4.0",
                            "mirko_image"};
                    restaurant = dataSource.createRestaurantDetails(restaurantInfo[0], restaurantInfo[1], restaurantInfo[2], restaurantInfo[3], restaurantInfo[4], restaurantInfo[5]);
                    TextView restaurantInfoText = (TextView) findViewById(R.id.info_text);
                    restaurantInfoText.setText("Name: " + restaurant.getRestaurantName() + "\n" +
                            "Location: " + restaurant.getRestaurantLocation() + "\n" +
                            "Timing: " + restaurant.getRestaurantTiming() + "\n" +
                            "Cuisine Type: " + restaurant.getCuisineType() + "\n" +
                            "Rating: " + restaurant.getRestaurantRating());
                    ImageView restaurantImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(restaurant.getRestaurantImage(), "drawable", InfoActivity.this.getPackageName());
                    restaurantImage.setImageResource(resID);
                } else if (optionSelected == 2) {
                    String[] restaurantInfo = new String[]{"Bomb Wings & Rice Bar",
                            "2373 Whitney ave",
                            "11:00 AM - 9:00 PM Mon-Thurs, 11:00 AM - 11:00 PM Fri-Sat, 11:00 AM - 9:00 PM Sun",
                            "Bar",
                            "4.5",
                            "b_wings_image"};
                    restaurant = dataSource.createRestaurantDetails(restaurantInfo[0], restaurantInfo[1], restaurantInfo[2], restaurantInfo[3], restaurantInfo[4], restaurantInfo[5]);
                    TextView restaurantInfoText = (TextView) findViewById(R.id.info_text);
                    restaurantInfoText.setText("Name: " + restaurant.getRestaurantName() + "\n" +
                            "Location: " + restaurant.getRestaurantLocation() + "\n" +
                            "Timing: " + restaurant.getRestaurantTiming() + "\n" +
                            "Cuisine Type: " + restaurant.getCuisineType() + "\n" +
                            "Rating: " + restaurant.getRestaurantRating());
                    ImageView restaurantImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(restaurant.getRestaurantImage(), "drawable", InfoActivity.this.getPackageName());
                    restaurantImage.setImageResource(resID);
                } else if (optionSelected == 3) {
                    String[] restaurantInfo = new String[]{"Freskos",
                            "2323 Whitney Ave",
                            "11:00 AM - 7:00 PM Mon-Fri, 11:00 Am - 4:00 PM Sat",
                            "Greek, Mediterranean, Coffee and Tea",
                            "4.5",
                            "freskos_image"};
                    restaurant = dataSource.createRestaurantDetails(restaurantInfo[0], restaurantInfo[1], restaurantInfo[2], restaurantInfo[3], restaurantInfo[4], restaurantInfo[5]);
                    TextView restaurantInfoText = (TextView) findViewById(R.id.info_text);
                    restaurantInfoText.setText("Name: " + restaurant.getRestaurantName() + "\n" +
                            "Location: " + restaurant.getRestaurantLocation() + "\n" +
                            "Timing: " + restaurant.getRestaurantTiming() + "\n" +
                            "Cuisine Type: " + restaurant.getCuisineType() + "\n" +
                            "Rating: " + restaurant.getRestaurantRating());
                    ImageView restaurantImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(restaurant.getRestaurantImage(), "drawable", InfoActivity.this.getPackageName());
                    restaurantImage.setImageResource(resID);
                } else if (optionSelected == 4) {
                    String[] restaurantInfo = new String[]{"The Cellar on Treadwell",
                            "295 Treadwell St Bld H",
                            "5:00 PM - 10 PM",
                            "Pub/Burgers",
                            "5.0",
                            "cellar_image"};
                    restaurant = dataSource.createRestaurantDetails(restaurantInfo[0], restaurantInfo[1], restaurantInfo[2], restaurantInfo[3], restaurantInfo[4], restaurantInfo[5]);
                    TextView restaurantInfoText = (TextView) findViewById(R.id.info_text);
                    restaurantInfoText.setText("Name: " + restaurant.getRestaurantName() + "\n" +
                            "Location: " + restaurant.getRestaurantLocation() + "\n" +
                            "Timing: " + restaurant.getRestaurantTiming() + "\n" +
                            "Cuisine Type: " + restaurant.getCuisineType() + "\n" +
                            "Rating: " + restaurant.getRestaurantRating());
                    ImageView restaurantImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(restaurant.getRestaurantImage(), "drawable", InfoActivity.this.getPackageName());
                    restaurantImage.setImageResource(resID);
                }
                break;
            case 2:
                if (optionSelected == 1) {
                    String[] parkInfo = new String[]{"Sleeping Giant State Park",
                            "200 Mt Carmel Ave",
                            "8:00 AM - 5:00 PM Mon-Sun",
                            "Hiking",
                            "4.5",
                            "s_giant_image"};
                    park = dataSource.createParkDetails(parkInfo[0], parkInfo[1], parkInfo[2], parkInfo[3], parkInfo[4], parkInfo[5]);
                    TextView parkInfoText = (TextView) findViewById(R.id.info_text);
                    parkInfoText.setText("Name: " + park.getParkName() + "\n" +
                            "Location: " + park.getParkLocation() + "\n" +
                            "Timing: " + park.getParkTiming() + "\n" +
                            "Attractions: " + park.getAttractions() + "\n" +
                            "Rating: " + park.getParkRating());
                    ImageView parkImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(park.getParkImage(), "drawable", InfoActivity.this.getPackageName());
                    parkImage.setImageResource(resID);
                } else if (optionSelected == 2) {
                    String[] parkInfo = new String[]{"West Rock Ridge State Park",
                            "40 Main St",
                            "8:00 AM - 5:00 Pm Mon-Sun",
                            "Hiking",
                            "5",
                            "w_rock_image"};
                    park = dataSource.createParkDetails(parkInfo[0], parkInfo[1], parkInfo[2], parkInfo[3], parkInfo[4], parkInfo[5]);
                    TextView parkInfoText = (TextView) findViewById(R.id.info_text);
                    parkInfoText.setText("Name: " + park.getParkName() + "\n" +
                            "Location: " + park.getParkLocation() + "\n" +
                            "Timing: " + park.getParkTiming() + "\n" +
                            "Attractions: " + park.getAttractions() + "\n" +
                            "Rating: " + park.getParkRating());
                    ImageView parkImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(park.getParkImage(), "drawable", InfoActivity.this.getPackageName());
                    parkImage.setImageResource(resID);
                } else if (optionSelected == 3) {
                    String[] parkInfo = new String[]{"East Rock Park",
                            "Gold Spring & Orange St",
                            "8:00 AM - 5:00 PM Mon-Sun",
                            "Hiking and Playground",
                            "4.0",
                            "e_rock_image"};
                    park = dataSource.createParkDetails(parkInfo[0], parkInfo[1], parkInfo[2], parkInfo[3], parkInfo[4], parkInfo[5]);
                    TextView parkInfoText = (TextView) findViewById(R.id.info_text);
                    parkInfoText.setText("Name: " + park.getParkName() + "\n" +
                            "Location: " + park.getParkLocation() + "\n" +
                            "Timing: " + park.getParkTiming() + "\n" +
                            "Attractions: " + park.getAttractions() + "\n" +
                            "Rating: " + park.getParkRating());
                    ImageView parkImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(park.getParkImage(), "drawable", InfoActivity.this.getPackageName());
                    parkImage.setImageResource(resID);
                } else if (optionSelected == 4) {
                    String[] parkInfo = new String[]{"Edgerton Park",
                            "75 Cliff St",
                            "10:00 AM - 4:00 PM Mon-Sun",
                            "Trail and Gardens",
                            "4.5",
                            "edgerton_image"};
                    park = dataSource.createParkDetails(parkInfo[0], parkInfo[1], parkInfo[2], parkInfo[3], parkInfo[4], parkInfo[5]);
                    TextView parkInfoText = (TextView) findViewById(R.id.info_text);
                    parkInfoText.setText("Name: " + park.getParkName() + "\n" +
                            "Location: " + park.getParkLocation() + "\n" +
                            "Timing: " + park.getParkTiming() + "\n" +
                            "Attractions: " + park.getAttractions() + "\n" +
                            "Rating: " + park.getParkRating());
                    ImageView parkImage = (ImageView) findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(park.getParkImage(), "drawable", InfoActivity.this.getPackageName());
                    parkImage.setImageResource(resID);
                }
                break;
            }
        }
}