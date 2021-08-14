package com.example.android.teamandroid;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class TakePictureActivity extends AppCompatActivity {

    private ImageView link_to_next_step;
    ImageView prendre_photo;
    ImageView photo_prise;

    Uri imageAffiche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_picture);
        
        prendre_photo=findViewById(R.id.photo_prise);
        photo_prise=findViewById(R.id.photo_prise);

        // Utiliser la camera du telephone au click sur le bouton
        prendre_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
                    if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED ||
                            checkSelfPermission(Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED){
                        String[]tabPermission={Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA};
                        requestPermissions(tabPermission, 100);
                    }else{
                        OpenCamera();
                    }
                }else
                    OpenCamera();
            }


        });
        
        // lien vers la page suivante
        this.link_to_next_step = (ImageView) findViewById(R.id.link_to_next_step);

        link_to_next_step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), InfosAgentActivity.class);
                startActivity(otherActivity);
            }
        });
    }
//Methode permettant l'activation de la camera
    private void OpenCamera() {
        ContentValues cv = new ContentValues();
        cv.put(MediaStore.Images.Media.TITLE, "Image obtenue");
        cv.put(MediaStore.Images.Media.DESCRIPTION, "Description image obtenue");
        imageAffiche = getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, cv);
        
        Intent CameraIntent = new Intent((MediaStore.ACTION_IMAGE_CAPTURE));
        CameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, imageAffiche);
        startActivityForResult(CameraIntent, 101);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode==100){
            if(grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
                OpenCamera();
            else
                Toast.makeText(this, "Permission manquante ", Toast.LENGTH_SHORT).show();
        }
         super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode==101)
            prendre_photo.setImageURI(imageAffiche);
        super.onActivityResult(requestCode, resultCode, data);
    }
}