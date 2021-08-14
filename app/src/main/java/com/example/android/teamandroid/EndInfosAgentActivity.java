package com.example.android.teamandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;

public class EndInfosAgentActivity extends AppCompatActivity {

    private ImageView list_agent;
//    private ClipData.Item navigation_dashboard;
    private BottomNavigationItemView navigation_dashboard;

    private static int SPLAH_TIME_OUT = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_infos_agent);

//        Lien pour lister les agents
        this.list_agent = (ImageView) findViewById(R.id.list_agent);

        list_agent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), ListAgentActivity.class);
                startActivity(otherActivity);
                finish();
            }
        });

        // Autre Lien pour lister les agents
        this.navigation_dashboard = (BottomNavigationItemView) findViewById(R.id.navigation_dashboard);

        navigation_dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), ListAgentActivity.class);
                startActivity(otherActivity);
                finish();
            }
        });

//        Plash page
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent loginIntent = new Intent(EndInfosAgentActivity.this, ListAgentActivity.class);
                startActivity(loginIntent);
                finish();
            }
        }, SPLAH_TIME_OUT);
    }
}