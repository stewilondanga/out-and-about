package io.github.stewilondanga.outandabout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView;
import android.view.View;


public class EventActivity extends AppCompatActivity {
    public TextView mLocationTextView;
    private ListView mListView;
    private String[] Places = new String[] {"Nairobi", "Kampala", "Dodoma", "Kigali"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("Out and about around: " + location);

        mListView = (ListView) findViewById(R.id.eventListView);
        mLocationTextView = (TextView) findViewById(R.id.eventTextView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Places);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int I, long l) {
                String restaurant = ((TextView)view).getText().toString();
                //Toast.makeText(EventActivity.this, Places Toast.LENGTH_SHORT).show();
            }
        });

        //Intent intent = getIntent();
        //String location = intent.getStringExtra("location");
        //mLocationTextView.setText("This is it: " + location);
    }
}