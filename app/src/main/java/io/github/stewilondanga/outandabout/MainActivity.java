package io.github.stewilondanga.outandabout;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mFindExploreButton;
    private Button mFindAboutButton;
    private EditText mLocationEditText;
    private TextView mMainTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFindExploreButton = (Button) findViewById(R.id.mainbutton1);
        mFindAboutButton = (Button) findViewById(R.id.mainbutton2);
        mLocationEditText = (EditText) findViewById(R.id.locationEditText);
        mMainTextView = (TextView) findViewById(R.id.mainTextView);

        mFindExploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                @Override
                public void onClick(View v) {
                    String location = mLocationEditText.getText().toString();
                    Intent intent = new Intent(MainActivity.this, EventActivity.class);
                    intent.putExtra("location", location);
                    startActivity(intent);
                }
            }
        });

        mFindAboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        Typeface CaviarDreams = Typeface.createFromAsset(getAssets(), "fonts/CaviarDreams.ttf");
        mMainTextView.setTypeface(CaviarDreams);
    }

}
