package io.github.stewilondanga.outandabout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EventActivity extends AppCompatActivity {
    private Button mFindExploreButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        mFindExploreButton = (Button) findViewById(R.id.mainbutton1);

        mFindExploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do something
            }
        });

    }
}