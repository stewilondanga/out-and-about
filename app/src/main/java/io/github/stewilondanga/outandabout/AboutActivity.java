package io.github.stewilondanga.outandabout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {
    private Button mFindAboutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        mFindAboutButton = (Button) findViewById(R.id.mainbutton2);
    }
}
