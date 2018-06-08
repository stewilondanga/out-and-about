package io.github.stewilondanga.outandabout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;


public class EventActivity extends AppCompatActivity {
    public TextView mEventTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        //Intent intent = getIntent();
        //String location = intent.getStringExtra("location");
        //mEventTextView.setText("Out and about around: " + location);
    }
}