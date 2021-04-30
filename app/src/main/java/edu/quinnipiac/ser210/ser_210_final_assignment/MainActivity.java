package edu.quinnipiac.ser210.ser_210_final_assignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.core.view.MenuItemCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.util.List;
/**
 * Kevin Couillard & Hephzibah Rajan
 * SER210 Final Assignment
 * Hamden Places Main Activity
 * 4/29/21
 */
public class MainActivity extends AppCompatActivity {
    //data source containing all location information, static to be referenced from other classes
    public static HamdenPlacesDataScource dataSource;
    private ShareActionProvider provider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_main);
        //initializing the data source and opening it
        dataSource = new HamdenPlacesDataScource(this);
        dataSource.open();

        //sets app logo image
        ImageView appLogo = (ImageView) findViewById(R.id.app_logo);
        appLogo.setImageResource(getResources().getIdentifier("hamden_places_app_logo","drawable",getPackageName()));

        //string arrays representing the info for each gas station
        String[] gasStationInfo1 = new String[]{"Hamden Ultra Sunoco",
                "2440 Dixwell Ave",
                "24 Hours Mon-Sun",
                "87 octane regular, 89 octane plus, 91 octane premium, and 93 octane ultra",
                "4.0",
                "sunoco_image"};
        String[] gasStationInfo2 = new String[]{"7-Eleven",
                "1795 Dixwell Ave",
                "24 Hours Mon-Sun",
                "87 octane regular, 89 octane plus, 91 octane premium",
                "5.0",
                "seven_eleven_image"};
        String[] gasStationInfo3 = new String[]{"Cumberland Farms",
                "249 State St",
                "24 Hours Mon-Sun",
                "87 octane regular, 89 octane plus, 91 octane premium",
                "3.5",
                "cumberland_farms_image"};
        String[] gasStationInfo4 = new String[]{"Shea's Service Center",
                "1182 Whitney Ave",
                "7:00 AM - 5:30 PM Mon-Fri, 7:00 AM - 12:00 AM Sat",
                "87 octane regular, 89 octane plus, 91 octane premium",
                "5.0",
                "sheas_service_center_image"};
        //populating the data source with each gas station
        dataSource.createGasDetails(gasStationInfo1[0], gasStationInfo1[1], gasStationInfo1[2], gasStationInfo1[3], gasStationInfo1[4], gasStationInfo1[5]);
        dataSource.createGasDetails(gasStationInfo2[0], gasStationInfo2[1], gasStationInfo2[2], gasStationInfo2[3], gasStationInfo2[4], gasStationInfo2[5]);
        dataSource.createGasDetails(gasStationInfo3[0], gasStationInfo3[1], gasStationInfo3[2], gasStationInfo3[3], gasStationInfo3[4], gasStationInfo3[5]);
        dataSource.createGasDetails(gasStationInfo4[0], gasStationInfo4[1], gasStationInfo4[2], gasStationInfo4[3], gasStationInfo4[4], gasStationInfo4[5]);

        //string arrays representing the info for each restaurant
        String[] restaurantInfo1 = new String[]{"Mirko Depot",
                "0 Depot Ave",
                "4:00 PM - 10 PM Mon-Wed, 11:30 AM - 11:00 PM Thurs-Sat",
                "Bar/Pub",
                "4.0",
                "mirko_image"};
        String[] restaurantInfo2 = new String[]{"Bomb Wings & Rice Bar",
                "2373 Whitney ave",
                "11:00 AM - 9:00 PM Mon-Thurs, 11:00 AM - 11:00 PM Fri-Sat, 11:00 AM - 9:00 PM Sun",
                "Bar",
                "4.5",
                "b_wings_image"};
        String[] restaurantInfo3 = new String[]{"Freskos",
                "2323 Whitney Ave",
                "11:00 AM - 7:00 PM Mon-Fri, 11:00 Am - 4:00 PM Sat",
                "Greek, Mediterranean, Coffee and Tea",
                "4.5",
                "freskos_image"};
        String[] restaurantInfo4 = new String[]{"The Cellar on Treadwell",
                "295 Treadwell St Bld H",
                "5:00 PM - 10 PM",
                "Pub/Burgers",
                "5.0",
                "cellar_image"};
        //populating the data source with each restaurant
        dataSource.createRestaurantDetails(restaurantInfo1[0], restaurantInfo1[1], restaurantInfo1[2], restaurantInfo1[3], restaurantInfo1[4], restaurantInfo1[5]);
        dataSource.createRestaurantDetails(restaurantInfo2[0], restaurantInfo2[1], restaurantInfo2[2], restaurantInfo2[3], restaurantInfo2[4], restaurantInfo2[5]);
        dataSource.createRestaurantDetails(restaurantInfo3[0], restaurantInfo3[1], restaurantInfo3[2], restaurantInfo3[3], restaurantInfo3[4], restaurantInfo3[5]);
        dataSource.createRestaurantDetails(restaurantInfo4[0], restaurantInfo4[1], restaurantInfo4[2], restaurantInfo4[3], restaurantInfo4[4], restaurantInfo4[5]);

        //string arrays representing the info for each park
        String[] parkInfo1 = new String[]{"Sleeping Giant State Park",
                "200 Mt Carmel Ave",
                "8:00 AM - 5:00 PM Mon-Sun",
                "Hiking",
                "4.5",
                "s_giant_image"};
        String[] parkInfo2 = new String[]{"West Rock Ridge State Park",
                "40 Main St",
                "8:00 AM - 5:00 Pm Mon-Sun",
                "Hiking",
                "5",
                "w_rock_image"};
        String[] parkInfo3 = new String[]{"East Rock Park",
                "Gold Spring & Orange St",
                "8:00 AM - 5:00 PM Mon-Sun",
                "Hiking and Playground",
                "4.0",
                "e_rock_image"};
        String[] parkInfo4 = new String[]{"Edgerton Park",
                "75 Cliff St",
                "10:00 AM - 4:00 PM Mon-Sun",
                "Trail and Gardens",
                "4.5",
                "edgerton_image"};
        //populating the data source with each park
        dataSource.createParkDetails(parkInfo1[0], parkInfo1[1], parkInfo1[2], parkInfo1[3], parkInfo1[4], parkInfo1[5]);
        dataSource.createParkDetails(parkInfo2[0], parkInfo2[1], parkInfo2[2], parkInfo2[3], parkInfo2[4], parkInfo2[5]);
        dataSource.createParkDetails(parkInfo3[0], parkInfo3[1], parkInfo3[2], parkInfo3[3], parkInfo3[4], parkInfo3[5]);
        dataSource.createParkDetails(parkInfo4[0], parkInfo4[1], parkInfo4[2], parkInfo4[3], parkInfo4[4], parkInfo4[5]);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options,menu);
        provider = (ShareActionProvider) MenuItemCompat.getActionProvider((MenuItem) menu.findItem(R.id.action_share));
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.change_color:
                //changes color
                Utils.changeToTheme(this, (int)(Math.random()*6));
                break;
            case R.id.action_share:
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(Intent.EXTRA_TEXT,"I'm using this amazing app which will help me find the " +
                        "closest gas station or park or restaurant");
                provider.setShareIntent(sharingIntent);
                break;
            default:
                return super.onOptionsItemSelected(item);

        }
        return super.onOptionsItemSelected(item);
    }

    public void startApp(View view) {
        //move from opening screen to services screen
        Intent intent = new Intent(this,ServicesActivity.class);
        startActivity(intent);
    }
}