package edu.quinnipiac.ser210.ser_210_final_assignment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
/**
 * Kevin Couillard & Hephzibah Rajan
 * SER210 Final Assignment
 * Hamden Places Options Fragment Class
 * 4/29/21
 */
public class OptionsFragment extends Fragment implements View.OnClickListener {
    private Button option1;
    private Button option2;
    private Button option3;
    private Button option4;
    public static int optionsSelected;
    //initialize nav controller
    NavController navController = null;

    public OptionsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_options, container,false);

        //initialize buttons & set on click listener on each
        option1 = (Button) layout.findViewById(R.id.option_1);
        option2 = (Button) layout.findViewById(R.id.option_2);
        option3 = (Button) layout.findViewById(R.id.option_3);
        option4 = (Button) layout.findViewById(R.id.option_4);
        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        return layout;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //link the nav controller to the view
        navController = Navigation.findNavController(view);

        //if to check the place type the user selects and sets the location/place names to the buttons accordingly
        if (getActivity().getIntent().getExtras().getInt("placeTypeSelected") == 0) {
            option1.setText(MainActivity.dataSource.getAllGasStations().get(0).getGasName());
            option2.setText(MainActivity.dataSource.getAllGasStations().get(1).getGasName());
            option3.setText(MainActivity.dataSource.getAllGasStations().get(2).getGasName());
            option4.setText(MainActivity.dataSource.getAllGasStations().get(3).getGasName());
            OptionsActivity.placeTypeHolder = 0;
        } else if (getActivity().getIntent().getExtras().getInt("placeTypeSelected") == 1) {
            option1.setText(MainActivity.dataSource.getAllRestaurants().get(0).getRestaurantName());
            option2.setText(MainActivity.dataSource.getAllRestaurants().get(1).getRestaurantName());
            option3.setText(MainActivity.dataSource.getAllRestaurants().get(2).getRestaurantName());
            option4.setText(MainActivity.dataSource.getAllRestaurants().get(3).getRestaurantName());
            OptionsActivity.placeTypeHolder = 1;
        } else if (getActivity().getIntent().getExtras().getInt("placeTypeSelected") == 2) {
            option1.setText(MainActivity.dataSource.getAllParks().get(0).getParkName());
            option2.setText(MainActivity.dataSource.getAllParks().get(1).getParkName());
            option3.setText(MainActivity.dataSource.getAllParks().get(2).getParkName());
            option4.setText(MainActivity.dataSource.getAllParks().get(3).getParkName());
            OptionsActivity.placeTypeHolder = 2;
        }
    }

    @Override
    public void onClick(View v) {
        //switch to check which location/place is selected to set the static variable to keep track of the user selection
        switch (v.getId()) {
            case R.id.option_1:
                optionsSelected = 0;
                break;
            case R.id.option_2:
                optionsSelected = 1;
                break;
            case R.id.option_3:
                optionsSelected = 2;
                break;
            case R.id.option_4:
                optionsSelected = 3;
                break;
        }
        //call navigate on the nav controller to move to the next fragment on location/place selected
        navController.navigate(R.id.action_optionsFragment_to_infoFragment);
    }
}