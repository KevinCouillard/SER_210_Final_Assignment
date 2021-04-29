package edu.quinnipiac.ser210.ser_210_final_assignment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
/**
 * Kevin Couillard & Hephzibah Rajan
 * SER210 Final Assignment
 * Hamden Places Info Fragment Class
 * 4/29/21
 */
public class InfoFragment extends Fragment {
    private View v;

    public InfoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //inflates the fragment and stores it as view object
        v = inflater.inflate(R.layout.fragment_info, container, false);

        //switch to check which type of place is being searched for
        switch (OptionsActivity.placeTypeHolder) {
            case 0:
                //if statements to check which location/place is being selected
                if (OptionsFragment.optionsSelected == 1) {
                    //sets the text view text & image view image to the gas station from the location/place selected
                    TextView gasStationInfoText = (TextView) v.findViewById(R.id.info_text);
                    gasStationInfoText.setText("Name: " + MainActivity.dataSource.getAllGasStations().get(0).getGasName() + "\n" + "\n" +
                            "Location: " + MainActivity.dataSource.getAllGasStations().get(0).getGasLocation() + "\n" + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllGasStations().get(0).getGasTiming() + "\n" + "\n" +
                            "Gas Type: " + MainActivity.dataSource.getAllGasStations().get(0).getGasType() + "\n" + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllGasStations().get(0).getGasRating());
                    ImageView gasStationImage = (ImageView) v.findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllGasStations().get(0).getGasImage(), "drawable", getActivity().getPackageName());
                    gasStationImage.setImageResource(resID);
                } else if (OptionsFragment.optionsSelected == 2) {
                    TextView gasStationInfoText = (TextView) v.findViewById(R.id.info_text);
                    gasStationInfoText.setText("Name: " + MainActivity.dataSource.getAllGasStations().get(1).getGasName() + "\n" + "\n" +
                            "Location: " + MainActivity.dataSource.getAllGasStations().get(1).getGasLocation() + "\n" + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllGasStations().get(1).getGasTiming() + "\n" + "\n" +
                            "Gas Type: " + MainActivity.dataSource.getAllGasStations().get(1).getGasType() + "\n" + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllGasStations().get(1).getGasRating());
                    ImageView gasStationImage = (ImageView) v.findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllGasStations().get(1).getGasImage(), "drawable", getActivity().getPackageName());
                    gasStationImage.setImageResource(resID);
                } else if (OptionsFragment.optionsSelected == 3) {
                    TextView gasStationInfoText = (TextView) v.findViewById(R.id.info_text);
                    gasStationInfoText.setText("Name: " + MainActivity.dataSource.getAllGasStations().get(2).getGasName() + "\n" + "\n" +
                            "Location: " + MainActivity.dataSource.getAllGasStations().get(2).getGasLocation() + "\n" + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllGasStations().get(2).getGasTiming() + "\n" + "\n" +
                            "Gas Type: " + MainActivity.dataSource.getAllGasStations().get(2).getGasType() + "\n" + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllGasStations().get(2).getGasRating());
                    ImageView gasStationImage = (ImageView) v.findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllGasStations().get(2).getGasImage(), "drawable", getActivity().getPackageName());
                    gasStationImage.setImageResource(resID);
                } else if (OptionsFragment.optionsSelected == 4) {
                    TextView gasStationInfoText = (TextView) v.findViewById(R.id.info_text);
                    gasStationInfoText.setText("Name: " + MainActivity.dataSource.getAllGasStations().get(3).getGasName() + "\n" + "\n" +
                            "Location: " + MainActivity.dataSource.getAllGasStations().get(3).getGasLocation() + "\n" + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllGasStations().get(3).getGasTiming() + "\n" + "\n" +
                            "Gas Type: " + MainActivity.dataSource.getAllGasStations().get(3).getGasType() + "\n" + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllGasStations().get(3).getGasRating());
                    ImageView gasStationImage = (ImageView) v.findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllGasStations().get(3).getGasImage(), "drawable", getActivity().getPackageName());
                    gasStationImage.setImageResource(resID);
                }
                break;
            case 1:
                if (OptionsFragment.optionsSelected == 1) {
                    //sets the text view text & image view image to the restaurant from the location/place selected
                    TextView restaurantInfoText = (TextView) v.findViewById(R.id.info_text);
                    restaurantInfoText.setText("Name: " + MainActivity.dataSource.getAllRestaurants().get(0).getRestaurantName() + "\n" + "\n" +
                            "Location: " + MainActivity.dataSource.getAllRestaurants().get(0).getRestaurantLocation() + "\n" + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllRestaurants().get(0).getRestaurantTiming() + "\n" + "\n" +
                            "Cuisine Type: " + MainActivity.dataSource.getAllRestaurants().get(0).getCuisineType() + "\n" + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllRestaurants().get(0).getRestaurantRating());
                    ImageView restaurantImage = (ImageView) v.findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllRestaurants().get(0).getRestaurantImage(), "drawable", getActivity().getPackageName());
                    restaurantImage.setImageResource(resID);
                } else if (OptionsFragment.optionsSelected == 2) {
                    TextView restaurantInfoText = (TextView) v.findViewById(R.id.info_text);
                    restaurantInfoText.setText("Name: " + MainActivity.dataSource.getAllRestaurants().get(1).getRestaurantName() + "\n" + "\n" +
                            "Location: " + MainActivity.dataSource.getAllRestaurants().get(1).getRestaurantLocation() + "\n" + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllRestaurants().get(1).getRestaurantTiming() + "\n" + "\n" +
                            "Cuisine Type: " + MainActivity.dataSource.getAllRestaurants().get(1).getCuisineType() + "\n" + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllRestaurants().get(1).getRestaurantRating());
                    ImageView restaurantImage = (ImageView) v.findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllRestaurants().get(1).getRestaurantImage(), "drawable", getActivity().getPackageName());
                    restaurantImage.setImageResource(resID);
                } else if (OptionsFragment.optionsSelected == 3) {
                    TextView restaurantInfoText = (TextView) v.findViewById(R.id.info_text);
                    restaurantInfoText.setText("Name: " + MainActivity.dataSource.getAllRestaurants().get(2).getRestaurantName() + "\n" + "\n" +
                            "Location: " + MainActivity.dataSource.getAllRestaurants().get(2).getRestaurantLocation() + "\n" + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllRestaurants().get(2).getRestaurantTiming() + "\n" + "\n" +
                            "Cuisine Type: " + MainActivity.dataSource.getAllRestaurants().get(2).getCuisineType() + "\n" + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllRestaurants().get(2).getRestaurantRating());
                    ImageView restaurantImage = (ImageView) v.findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllRestaurants().get(2).getRestaurantImage(), "drawable", getActivity().getPackageName());
                    restaurantImage.setImageResource(resID);
                } else if (OptionsFragment.optionsSelected == 4) {
                    TextView restaurantInfoText = (TextView) v.findViewById(R.id.info_text);
                    restaurantInfoText.setText("Name: " + MainActivity.dataSource.getAllRestaurants().get(3).getRestaurantName() + "\n" + "\n" +
                            "Location: " + MainActivity.dataSource.getAllRestaurants().get(3).getRestaurantLocation() + "\n" + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllRestaurants().get(3).getRestaurantTiming() + "\n" + "\n" +
                            "Cuisine Type: " + MainActivity.dataSource.getAllRestaurants().get(3).getCuisineType() + "\n" + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllRestaurants().get(3).getRestaurantRating());
                    ImageView restaurantImage = (ImageView) v.findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllRestaurants().get(3).getRestaurantImage(), "drawable", getActivity().getPackageName());
                    restaurantImage.setImageResource(resID);
                }
                break;
            case 2:
                if (OptionsFragment.optionsSelected == 1) {
                    //sets the text view text & image view image to the park from the location/place selected
                    TextView parkInfoText = (TextView) v.findViewById(R.id.info_text);
                    parkInfoText.setText("Name: " + MainActivity.dataSource.getAllParks().get(0).getParkName() + "\n" + "\n" +
                            "Location: " + MainActivity.dataSource.getAllParks().get(0).getParkLocation() + "\n" + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllParks().get(0).getParkTiming() + "\n" + "\n" +
                            "Attractions: " + MainActivity.dataSource.getAllParks().get(0).getAttractions() + "\n" + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllParks().get(0).getParkRating());
                    ImageView parkImage = (ImageView) v.findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllParks().get(0).getParkImage(), "drawable", getActivity().getPackageName());
                    parkImage.setImageResource(resID);
                } else if (OptionsFragment.optionsSelected == 2) {
                    TextView parkInfoText = (TextView) v.findViewById(R.id.info_text);
                    parkInfoText.setText("Name: " + MainActivity.dataSource.getAllParks().get(1).getParkName() + "\n" + "\n" +
                            "Location: " + MainActivity.dataSource.getAllParks().get(1).getParkLocation() + "\n" + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllParks().get(1).getParkTiming() + "\n" + "\n" +
                            "Attractions: " + MainActivity.dataSource.getAllParks().get(1).getAttractions() + "\n" + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllParks().get(1).getParkRating());
                    ImageView parkImage = (ImageView) v.findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllParks().get(1).getParkImage(), "drawable", getActivity().getPackageName());
                    parkImage.setImageResource(resID);
                } else if (OptionsFragment.optionsSelected == 3) {
                    TextView parkInfoText = (TextView) v.findViewById(R.id.info_text);
                    parkInfoText.setText("Name: " + MainActivity.dataSource.getAllParks().get(2).getParkName() + "\n" + "\n" +
                            "Location: " + MainActivity.dataSource.getAllParks().get(2).getParkLocation() + "\n" + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllParks().get(2).getParkTiming() + "\n" + "\n" +
                            "Attractions: " + MainActivity.dataSource.getAllParks().get(2).getAttractions() + "\n" + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllParks().get(2).getParkRating());
                    ImageView parkImage = (ImageView) v.findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllParks().get(2).getParkImage(), "drawable", getActivity().getPackageName());
                    parkImage.setImageResource(resID);
                } else if (OptionsFragment.optionsSelected == 4) {
                    TextView parkInfoText = (TextView) v.findViewById(R.id.info_text);
                    parkInfoText.setText("Name: " + MainActivity.dataSource.getAllParks().get(3).getParkName() + "\n" + "\n" +
                            "Location: " + MainActivity.dataSource.getAllParks().get(3).getParkLocation() + "\n" + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllParks().get(3).getParkTiming() + "\n" + "\n" +
                            "Attractions: " + MainActivity.dataSource.getAllParks().get(3).getAttractions() + "\n" + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllParks().get(3).getParkRating());
                    ImageView parkImage = (ImageView) v.findViewById(R.id.info_image);
                    int resID = getResources().getIdentifier(MainActivity.dataSource.getAllParks().get(3).getParkImage(), "drawable", getActivity().getPackageName());
                    parkImage.setImageResource(resID);
                }
                break;
        }
        return v;
    }
}