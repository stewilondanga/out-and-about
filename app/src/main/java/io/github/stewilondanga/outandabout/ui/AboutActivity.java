package io.github.stewilondanga.outandabout.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Typeface;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.stewilondanga.outandabout.R;

public class AboutActivity extends AppCompatActivity {
    @BindView(R.id.aboutListView) ListView mListView;
    @BindView(R.id.aboutTextView) TextView mTextView;

    private String[] About = new String[] {"This is an application that lists events happening", "Created by Stewart ilondanga", "stilondanga@gmail.com", "Copyright 2018"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ButterKnife.bind(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, About);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int I, long l) {
                String About = ((TextView)view).getText().toString();
                Toast.makeText(AboutActivity.this, "Created by Stewart ilondanga", Toast.LENGTH_SHORT).show();
            }
        });

        Intent intent = getIntent();
        String About = intent.getStringExtra("About");
        mTextView.setText("Your regular event Catalogue");

        Typeface CaviarDreams = Typeface.createFromAsset(getAssets(), "fonts/CaviarDreams.ttf");
        mTextView.setTypeface(CaviarDreams);
    }


}
