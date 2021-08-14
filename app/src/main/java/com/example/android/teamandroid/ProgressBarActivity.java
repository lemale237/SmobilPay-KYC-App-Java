package com.example.android.teamandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.github.ybq.android.spinkit.style.FadingCircle;

public class ProgressBarActivity extends AppCompatActivity {

    ProgressBar progressBar;
    private ImageView launch_form;

    private static int SPLAH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        // demarrage de la barre de progression
        progressBar = (ProgressBar)findViewById(R.id.SpinKit);
        FadingCircle fadingCircle = new FadingCircle();
        progressBar.setIndeterminateDrawable(fadingCircle);

        // Validation au click sur le logo
        this.launch_form = (ImageView) findViewById(R.id.launch_form);
        launch_form.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), TakePictureActivity.class);
                startActivity(otherActivity);
                finish();
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent loginIntent = new Intent(ProgressBarActivity.this, TakePictureActivity.class);
                startActivity(loginIntent);
                finish();
            }
        }, SPLAH_TIME_OUT);
    }
}