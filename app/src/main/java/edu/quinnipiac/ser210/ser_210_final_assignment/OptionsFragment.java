package edu.quinnipiac.ser210.ser_210_final_assignment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class OptionsFragment extends Fragment implements View.OnClickListener {
    private Button option1;
    private Button option2;
    private Button option3;
    private Button option4;

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

    }
}