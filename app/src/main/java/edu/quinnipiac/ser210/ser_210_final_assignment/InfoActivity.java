package edu.quinnipiac.ser210.ser_210_final_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
        if (optionSelected == 1) {
            String[] gasStationInfo = new String[] {"Hamden Ultra Sunoco",
                    "2440 Dixwell Ave",
                    "24 Hours Mon-Sun",
                    "87 octane regular, 89 octane plus, 91 octane premium, and 93 octane ultra",
                    "4.0"};
            gasStation = dataSource.createDetails(gasStationInfo[0],gasStationInfo[1],gasStationInfo[2],gasStationInfo[3],gasStationInfo[4]);
            TextView gasStationInfoText = (TextView) findViewById(R.id.info_text);
            gasStationInfoText.setText("Name: " + gasStation.getName() + "\n" +
                    "Location: " + gasStation.getLocation() + "\n" +
                    "Timing: " + gasStation.getTiming() + "\n" +
                    "Gas Type: " + gasStation.getGasType() + "\n" +
                    "Rating: " + gasStation.getRating());
        } else if (optionSelected == 2) {
            String[] gasStationInfo = new String[] {"7-Eleven",
                    "1795 Dixwell Ave",
                    "24 Hours Mon-Sun",
                    "87 octane regular, 89 octane plus, 91 octane premium",
                    "5.0"};
            gasStation = dataSource.createDetails(gasStationInfo[0],gasStationInfo[1],gasStationInfo[2],gasStationInfo[3],gasStationInfo[4]);
            TextView gasStationInfoText = (TextView) findViewById(R.id.info_text);
            gasStationInfoText.setText("Name: " + gasStation.getName() + "\n" +
                    "Location: " + gasStation.getLocation() + "\n" +
                    "Timing: " + gasStation.getTiming() + "\n" +
                    "Gas Type: " + gasStation.getGasType() + "\n" +
                    "Rating: " + gasStation.getRating());
        } else if (optionSelected == 3) {
            String[] gasStationInfo = new String[] {"Cumberland Farms",
                    "249 State St",
                    "24 Hours Mon-Sun",
                    "87 octane regular, 89 octane plus, 91 octane premium",
                    "3.5"};
            gasStation = dataSource.createDetails(gasStationInfo[0],gasStationInfo[1],gasStationInfo[2],gasStationInfo[3],gasStationInfo[4]);
            TextView gasStationInfoText = (TextView) findViewById(R.id.info_text);
            gasStationInfoText.setText("Name: " + gasStation.getName() + "\n" +
                    "Location: " + gasStation.getLocation() + "\n" +
                    "Timing: " + gasStation.getTiming() + "\n" +
                    "Gas Type: " + gasStation.getGasType() + "\n" +
                    "Rating: " + gasStation.getRating());
        } else if (optionSelected == 4) {
            String[] gasStationInfo = new String[] {"Shea's Service Center",
                    "1182 Whitney Ave",
                    "7:00 AM - 5:30 PM Mon-Fri, 7:00 AM - 12:00 AM Sat",
                    "87 octane regular, 89 octane plus, 91 octane premium",
                    "5.0"};
            gasStation = dataSource.createDetails(gasStationInfo[0],gasStationInfo[1],gasStationInfo[2],gasStationInfo[3],gasStationInfo[4]);
            TextView gasStationInfoText = (TextView) findViewById(R.id.info_text);
            gasStationInfoText.setText("Name: " + gasStation.getName() + "\n" +
                    "Location: " + gasStation.getLocation() + "\n" +
                    "Timing: " + gasStation.getTiming() + "\n" +
                    "Gas Type: " + gasStation.getGasType() + "\n" +
                    "Rating: " + gasStation.getRating());
        }
    }
}