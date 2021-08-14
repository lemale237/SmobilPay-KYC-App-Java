package com.example.android.teamandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class InfosOneAgentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infos_one_agent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.modifier:
                Intent otherActivity = new Intent(getApplicationContext(), InfosModifierActivity.class);
                startActivity(otherActivity);

                //  Afficher un message temporaire (Falcultatif)
                Toast.makeText(this, "Informations modifiées avec succès", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.supprimer:
                Intent otherActivity2 = new Intent(getApplicationContext(), InfosSupprimerActivity.class);
                startActivity(otherActivity2);

                //  Afficher un message temporaire (Falcultatif)
                Toast.makeText(this, "Agent supprimé avec succès", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}