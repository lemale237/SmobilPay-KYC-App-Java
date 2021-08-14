package com.example.android.teamandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;

public class ListAgentActivity extends AppCompatActivity {

    private ImageView link_to_last_step;
    private CardView first_agent;
    private BottomNavigationItemView navigation_home;
    private BottomNavigationItemView navigation_dashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_agent);

// ==================================================================================================
        // lien vers la page info d'un agent
        this.first_agent = (CardView) findViewById(R.id.first_agent);

        first_agent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), InfosOneAgentActivity.class);
                startActivity(otherActivity);
            }
        });
// ==================================================================================================
        //        Lien pour lister les agents
        this.link_to_last_step = (ImageView) findViewById(R.id.link_to_last_step);

        link_to_last_step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), InfosAgentActivity3.class);
                startActivity(otherActivity);
            }
        });
// ==================================================================================================
        // Lien vers debut du formulaire
        this.navigation_home = (BottomNavigationItemView) findViewById(R.id.navigation_home);

        navigation_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), TakePictureActivity.class);
                startActivity(otherActivity);
                finish();
            }
        });
// ==================================================================================================
        // Lien pour lister les agents
        this.navigation_dashboard = (BottomNavigationItemView) findViewById(R.id.navigation_dashboard);

        navigation_dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), ListAgentActivity.class);
                startActivity(otherActivity);
                finish();
            }
        });
    }
}