package com.example.android.teamandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class InfosSupprimerActivity extends AppCompatActivity {

    private static int SPLAH_TIME_OUT = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infos_supprimer);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent loginIntent = new Intent(InfosSupprimerActivity.this, ListAgentActivity.class);
                startActivity(loginIntent);
                finish();
            }
        }, SPLAH_TIME_OUT);
    }
}