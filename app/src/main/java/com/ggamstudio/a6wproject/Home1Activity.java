package com.ggamstudio.a6wproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home1Activity extends AppCompatActivity {

    BottomNavigationView bnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home1);

        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bnv= findViewById(R.id.bnv);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.bnv_home:
                        findViewById(R.id.layout_content);
                        break;
                    case R.id.bnv_search:
                        findViewById(R.id.layout_content);
                        break;
                    case R.id.bnv_upload:
                        findViewById(R.id.layout_content);
                        break;
                    case R.id.bnv_favorite:
                        findViewById(R.id.bnv_favorite);
                        break;
                    case R.id.bnv_my:
                        findViewById(R.id.layout_content);
                }

                return true;
            }
        });

    }
}
