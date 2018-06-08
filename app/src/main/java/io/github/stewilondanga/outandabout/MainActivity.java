package io.github.stewilondanga.outandabout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mFindExploreButton;
    private Button mFindAboutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFindExploreButton = (Button) findViewById(R.id.mainbutton1);
        mFindAboutButton = (Button) findViewById(R.id.mainbutton2);

        mFindExploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Out and about", Toast.LENGTH_SHORT).show();
            }
        });

        mFindAboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Explore the world", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
