package io.github.stewilondanga.outandabout.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.stewilondanga.outandabout.R;
import io.github.stewilondanga.outandabout.services.MeetupService;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;


public class EventActivity extends AppCompatActivity {
    public static final String TAG = EventActivity.class.getSimpleName();
    @BindView(R.id.eventTextView) TextView mLocationTextView;
    @BindView(R.id.eventListView) ListView mListView;

    private OutAndAboutListAdapter mAdapter;
    private List<events> mEvents = newArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        getListItem(events);
    }

    private void getListItem(String event) {
        final MeetupService meetupService = new MeetupService();
        meetupService.findListItem(event, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }
            @Override
            public void onResponse(Call call, Response response){
                mEvents = MeetupService.processResults(response);

                EventActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mAdapter = new OutAndAboutListAdapter(getApplicationContext(), mEvents);
                        mRecyclerView.setAdapter(mAdapter);
                        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(newActivity.this);
                        mRecyclerView.setLayoutManager(layoutManager);
                        mRecyclerView.setHasFixedSize(true);
                    }
                });
            }
        });
    }
}