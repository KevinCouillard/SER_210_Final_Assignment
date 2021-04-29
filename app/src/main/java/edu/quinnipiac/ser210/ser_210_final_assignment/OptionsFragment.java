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

public class OptionsFragment extends Fragment implements View.OnClickListener {
    private Button option1;
    private Button option2;
    private Button option3;
    private Button option4;
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
        navController = Navigation.findNavController(view);
        view.findViewById(R.id.option_1).setOnClickListener(this);
        view.findViewById(R.id.option_2).setOnClickListener(this);
        view.findViewById(R.id.option_3).setOnClickListener(this);
        view.findViewById(R.id.option_4).setOnClickListener(this);

        if (getActivity().getIntent().getExtras().getInt("placeTypeSelected") == 0) {
            option1.setText("Hamden Ultra Sunoco");
            option2.setText("7-Eleven");
            option3.setText("Cumberland Farms");
            option4.setText("Shea's Service Center");
            OptionsActivity.placeTypeHolder = 0;
        } else if (getActivity().getIntent().getExtras().getInt("placeTypeSelected") == 1) {
            option1.setText("Mikro Depot");
            option2.setText("Bomb Wings & Rice Bar");
            option3.setText("Freskos");
            option4.setText("The Cellar on Treadwell");
            OptionsActivity.placeTypeHolder = 1;
        } else if (getActivity().getIntent().getExtras().getInt("placeTypeSelected") == 2) {
            option1.setText("Sleeping Giant State Park");
            option2.setText("West Rock Ridge State Park");
            option3.setText("East Rock Park");
            option4.setText("Edgerton Park");
            OptionsActivity.placeTypeHolder = 2;
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this.getActivity(), InfoActivity.class);
        switch (v.getId()) {
            case R.id.option_1:
                intent.putExtra("optionSelected", 1);
                startActivity(intent);
                break;
            case R.id.option_2:
                intent.putExtra("optionSelected", 2);
                startActivity(intent);
                break;
            case R.id.option_3:
                intent.putExtra("optionSelected", 3);
                startActivity(intent);
                break;
            case R.id.option_4:
                intent.putExtra("optionSelected", 4);
                startActivity(intent);
                break;
        }
        navController.navigate(R.id.action_optionsFragment_to_infoFragment);
    }
}