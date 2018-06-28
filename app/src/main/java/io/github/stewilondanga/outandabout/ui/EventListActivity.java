package io.github.stewilondanga.outandabout.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.io.IOException;
import java.util.ArrayList;


import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.stewilondanga.outandabout.Constants;
import io.github.stewilondanga.outandabout.R;
import io.github.stewilondanga.outandabout.adapters.OutAndAboutListAdapter;
import io.github.stewilondanga.outandabout.models.Event;
import io.github.stewilondanga.outandabout.services.MeetupService;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;


public class EventListActivity extends AppCompatActivity {
    private SharedPreferences mSharedPreferences;
    private String mRecentListItem;

    //public static final String TAG = EventListActivity.class.getSimpleName();
    @BindView(R.id.recyclerView) RecyclerView mRecyclerView;
    private OutAndAboutListAdapter mAdapter;

    private ArrayList<Event> mEvents = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        ButterKnife.bind(this);

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mRecentListItem = mSharedPreferences.getString(Constants.PREFERENCES_LISTITEM_KEY, null)

        //Intent intent = getIntent();
        //String lat = intent.getStringExtra("latitude");
        //String lon = intent.getStringExtra("longitude");

        //getListItem(lat, lon);
    }

    private void getListItem(String lat, String lon) {
        final MeetupService meetupService =new MeetupService();
        meetupService.findEvents(lat, lon, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                mEvents = MeetupService.processResults(response);

                EventListActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mAdapter = new OutAndAboutListAdapter(getApplicationContext(), mEvents);
                        mRecyclerView.setAdapter(mAdapter);
                        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(EventListActivity.this);
                        mRecyclerView.setLayoutManager(layoutManager);
                        mRecyclerView.setHasFixedSize(true);
                    }
                });
            }
        });
    }

}

