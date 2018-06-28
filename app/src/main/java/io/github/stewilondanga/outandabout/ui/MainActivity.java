package io.github.stewilondanga.outandabout.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.stewilondanga.outandabout.Constants;
import io.github.stewilondanga.outandabout.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //private SharedPreferences mSharedPreferences;
    //private SharedPreferences.Editor mEditor;

    @BindView(R.id.mainbutton1) Button mFindExploreButton;
    @BindView(R.id.mainbutton2) Button mFindAboutButton;
    @BindView(R.id.LatitudeEditText) EditText mLatitudeEditText;
    @BindView(R.id.LongitudeEditText) EditText mLongitudeEditText;
    @BindView(R.id.mainTextView) TextView mMainTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Typeface CaviarDreams = Typeface.createFromAsset(getAssets(), "fonts/CaviarDreams.ttf");
        mMainTextView.setTypeface(CaviarDreams);

        //mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        //mEditor = mSharedPreferences.edit();

        //Getting LocationManager object
        LocationManager lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        if (LocationManager.GPS_PROVIDER!=null && !LocationManager.GPS_PROVIDER.equals("")){
            // Get the location from the given provider
            try {
                Location location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
                double longitude = location.getLongitude();
                double latitude = location.getLatitude();
                Toast.makeText(MainActivity.this, "location", Toast.LENGTH_SHORT).show();
            } catch (SecurityException e) {
                e.printStackTrace();
            }
        }

        Intent intent1 = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
        startActivity(intent1);


        mFindExploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == mFindExploreButton){
                    String event = mEventsEditText.getText().toString();
                    //if (!(event).equals("")){
                    //    addToSharedPreferences(event);
                    //}
                    Intent intent = new Intent(MainActivity.this, EventListActivity.class);
                    startActivity(intent);
                }
                //String latitude = mLatitudeEditText.getText().toString();
                //String longitude =mLongitudeEditText .getText().toString();
                //intent.putExtra("latitude", latitude);
                //intent.putExtra("longitude", longitude);
            public void saveListitemToFirebase(String event) {
                    mSearchedEventListitemReference.setValue(event);
            }

            }
        });

    }

        mFindAboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);

            }
        });

    private void addToSharedPreferences(String listitem){
        mEditor.putString(Constants.PREFERENCES_LISTITEM_KEY, listitem).apply();

    }

        private final LocationListener locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                double longitude = location.getLongitude();
                double latitude = location.getLatitude();
            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            @Override
            public void onProviderEnabled(String provider) {

            }

            @Override
            public void onProviderDisabled(String provider) {

            }
        };


}




