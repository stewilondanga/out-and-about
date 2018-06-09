package io.github.stewilondanga.outandabout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;


public class EventActivity extends AppCompatActivity {
    @BindView(R.id.eventTextView) TextView mLocationTextView;
    @BindView(R.id.eventListView) ListView mListView;

    private String[] Places = new String[] {"Nairobi", "Kampala", "Dodoma", "Kigali", "Cairo", "Durban", "Abuja"};
    private String[] event = new String[] {"Concert", "Festivity", "Rally", "Wedding", "Demonstration", "Dolphin count", "Auditions"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        ButterKnife.bind(this);

        mListView = (ListView) findViewById(R.id.eventListView);
        mLocationTextView = (TextView) findViewById(R.id.eventTextView);

        OutAndAboutArrayAdapter adapter = new OutAndAboutArrayAdapter(this, android.R.layout.simple_list_item_1, Places, event);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int I, long l) {
                String restaurant = ((TextView)view).getText().toString();
                Toast.makeText(EventActivity.this, "location", Toast.LENGTH_SHORT).show();
            }
        });


    }
}