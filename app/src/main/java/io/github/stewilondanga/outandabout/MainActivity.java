package io.github.stewilondanga.outandabout;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.mainbutton1) Button mFindExploreButton;
    @BindView(R.id.mainbutton2) Button mFindAboutButton;
    @BindView(R.id.locationEditText) EditText mLocationEditText;
    @BindView(R.id.mainTextView) TextView mMainTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mFindExploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   String Places = mLocationEditText.getText().toString();
                   Intent intent = new Intent(MainActivity.this, EventActivity.class);
                   intent.putExtra("location", Places);
                   startActivity(intent);
            }
        });

        mFindAboutButton.setOnClickListener(new View.OnClickListener(){
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




