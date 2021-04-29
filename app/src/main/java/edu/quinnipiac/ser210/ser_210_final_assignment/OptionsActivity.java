package edu.quinnipiac.ser210.ser_210_final_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
/**
 * Kevin Couillard & Hephzibah Rajan
 * SER210 Final Assignment
 * Hamden Places Options Activity
 * 4/29/21
 */
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
    }
}