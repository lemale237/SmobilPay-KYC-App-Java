package com.example.android.teamandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class InfosAgentActivity extends AppCompatActivity {

    private TextView etape_1;
    private ImageView link_to_next_step;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infos_agent);

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

        // lien vers la page suivante
        this.link_to_next_step = (ImageView) findViewById(R.id.link_to_next_step);

        link_to_next_step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), InfosAgentActivity2.class);
                startActivity(otherActivity);
            }
        });
    }
}