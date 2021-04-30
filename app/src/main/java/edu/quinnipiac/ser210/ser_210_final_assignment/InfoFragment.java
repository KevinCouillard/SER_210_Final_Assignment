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
                    //sets the text view text & image view image to the gas station from the location/place selected
                    TextView gasStationInfoText = (TextView) v.findViewById(R.id.info_text);
                    gasStationInfoText.setText("Name: " + MainActivity.dataSource.getAllGasStations().get(OptionsFragment.optionsSelected).getGasName() + "\n" + "\n" +
                            "Location: " + MainActivity.dataSource.getAllGasStations().get(OptionsFragment.optionsSelected).getGasLocation() + "\n" + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllGasStations().get(OptionsFragment.optionsSelected).getGasTiming() + "\n" + "\n" +
                            "Gas Type: " + MainActivity.dataSource.getAllGasStations().get(OptionsFragment.optionsSelected).getGasType() + "\n" + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllGasStations().get(OptionsFragment.optionsSelected).getGasRating());
                    ImageView gasStationImage = (ImageView) v.findViewById(R.id.info_image);
                    int resGasID = getResources().getIdentifier(MainActivity.dataSource.getAllGasStations().get(OptionsFragment.optionsSelected).getGasImage(), "drawable", getActivity().getPackageName());
                    gasStationImage.setImageResource(resGasID);
                break;
            case 1:
                    //sets the text view text & image view image to the restaurant from the location/place selected
                    TextView restaurantInfoText = (TextView) v.findViewById(R.id.info_text);
                    restaurantInfoText.setText("Name: " + MainActivity.dataSource.getAllRestaurants().get(OptionsFragment.optionsSelected).getRestaurantName() + "\n" + "\n" +
                            "Location: " + MainActivity.dataSource.getAllRestaurants().get(OptionsFragment.optionsSelected).getRestaurantLocation() + "\n" + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllRestaurants().get(OptionsFragment.optionsSelected).getRestaurantTiming() + "\n" + "\n" +
                            "Cuisine Type: " + MainActivity.dataSource.getAllRestaurants().get(OptionsFragment.optionsSelected).getCuisineType() + "\n" + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllRestaurants().get(OptionsFragment.optionsSelected).getRestaurantRating());
                    ImageView restaurantImage = (ImageView) v.findViewById(R.id.info_image);
                    int resRestaurantID = getResources().getIdentifier(MainActivity.dataSource.getAllRestaurants().get(OptionsFragment.optionsSelected).getRestaurantImage(), "drawable", getActivity().getPackageName());
                    restaurantImage.setImageResource(resRestaurantID);
                break;
            case 2:
                    //sets the text view text & image view image to the Park from the location/place selected
                    TextView parkInfoText = (TextView) v.findViewById(R.id.info_text);
                    parkInfoText.setText("Name: " + MainActivity.dataSource.getAllParks().get(OptionsFragment.optionsSelected).getParkName() + "\n" + "\n" +
                            "Location: " + MainActivity.dataSource.getAllParks().get(OptionsFragment.optionsSelected).getParkLocation() + "\n" + "\n" +
                            "Timing: " + MainActivity.dataSource.getAllParks().get(OptionsFragment.optionsSelected).getParkTiming() + "\n" + "\n" +
                            "Attractions: " + MainActivity.dataSource.getAllParks().get(OptionsFragment.optionsSelected).getAttractions() + "\n" + "\n" +
                            "Rating: " + MainActivity.dataSource.getAllParks().get(OptionsFragment.optionsSelected).getParkRating());
                    ImageView parkImage = (ImageView) v.findViewById(R.id.info_image);
                    int resParkID = getResources().getIdentifier(MainActivity.dataSource.getAllParks().get(OptionsFragment.optionsSelected).getParkImage(), "drawable", getActivity().getPackageName());
                    parkImage.setImageResource(resParkID);
                break;
        }
        return v;
    }
}