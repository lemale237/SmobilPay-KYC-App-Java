package com.example.android.teamandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class InfosAgentActivity3 extends AppCompatActivity {

    private TextView etape_1;
    private TextView etape_2;
    private TextView etape_3;
    private ImageView link_to_end_step;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infos_agent3);

// ==================================================================================================
        // lien vers la page etape 1
        this.etape_1 = (TextView) findViewById(R.id.etape_1);

        etape_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), TakePictureActivity.class);
                startActivity(otherActivity);
                finish();
            }
        });
// ==================================================================================================
        // lien vers la page etape 2
        this.etape_2 = (TextView) findViewById(R.id.etape_2);

        etape_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), InfosAgentActivity.class);
                startActivity(otherActivity);
                finish();
            }
        });
// ==================================================================================================
        // lien vers la page etape 3
        this.etape_3 = (TextView) findViewById(R.id.etape_3);

        etape_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), InfosAgentActivity2.class);
                startActivity(otherActivity);
                finish();
            }
        });
// ==================================================================================================

        // lien vers la page validation etapes
        this.link_to_end_step = (ImageView) findViewById(R.id.link_to_end_step);

        link_to_end_step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), EndInfosAgentActivity.class);
                startActivity(otherActivity);
                finish();
            }
        });
    }
}