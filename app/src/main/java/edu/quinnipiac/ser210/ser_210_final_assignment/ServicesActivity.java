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
/**
 * Kevin Couillard & Hephzibah Rajan
 * SER210 Final Assignment
 * Hamden Places Services Activity
 * 4/29/21
 */
public class ServicesActivity extends AppCompatActivity {

    private ShareActionProvider provider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_services);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) actionBar.setDisplayHomeAsUpEnabled(true);
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
                sharingIntent.putExtra(Intent.EXTRA_TEXT,"(EditText)findViewById(R.id.score).getText().toString");
                provider.setShareIntent(sharingIntent);
                break;
            default: return super.onOptionsItemSelected(item);

        }
        return super.onOptionsItemSelected(item);

    }
}