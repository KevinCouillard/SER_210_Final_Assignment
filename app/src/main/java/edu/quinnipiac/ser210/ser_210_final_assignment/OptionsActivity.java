package edu.quinnipiac.ser210.ser_210_final_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class OptionsActivity extends AppCompatActivity {
    public static int placeTypeHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        Button option1 = (Button) findViewById(R.id.option_1);
        Button option2 = (Button) findViewById(R.id.option_2);
        Button option3 = (Button) findViewById(R.id.option_3);
        Button option4 = (Button) findViewById(R.id.option_4);
        if (getIntent().getExtras().getInt("placeTypeSelected") == 0) {
            option1.setText("Hamden Ultra Sunoco");
            option2.setText("7-Eleven");
            option3.setText("Cumberland Farms");
            option4.setText("Shea's Service Center");
            placeTypeHolder = 0;
        } else if (getIntent().getExtras().getInt("placeTypeSelected") == 1) {
            option1.setText("Mikro Depot");
            option2.setText("Bomb Wings & Rice Bar");
            option3.setText("Freskos");
            option4.setText("The Cellar on Treadwell");
            placeTypeHolder = 1;
        } else if (getIntent().getExtras().getInt("placeTypeSelected") == 2) {
            option1.setText("Sleeping Giant State Park");
            option2.setText("West Rock Ridge State Park");
            option3.setText("East Rock Park");
            option4.setText("Edgerton Park");
            placeTypeHolder = 2;
        }
    }
}