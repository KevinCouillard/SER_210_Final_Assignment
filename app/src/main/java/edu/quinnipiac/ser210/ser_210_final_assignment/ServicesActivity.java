package edu.quinnipiac.ser210.ser_210_final_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ServicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
    }

    public void start_options(View view) {
        Intent intent = new Intent(this, OptionsActivity.class);

        switch (view.getId()) {
            case R.id.gas_stations:
                intent.putExtra("placeTypeSelected", 0);
                startActivity(intent);
                break;
            case R.id.restaurants:
                intent.putExtra("placeTypeSelected", 1);
                startActivity(intent);
                break;
            case R.id.parks:
                intent.putExtra("placeTypeSelected", 2);
                startActivity(intent);
                break;
        }

    }
}