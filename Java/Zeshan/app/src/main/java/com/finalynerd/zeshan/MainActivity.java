package com.finalynerd.zeshan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void imran(View N){
            ImageView imgFavorite = findViewById(R.id.about);
            imgFavorite.setClickable(true);
            imgFavorite.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this,About.class);
                startActivity(intent);

            });

            ImageView education = findViewById(R.id.education);
            education.setClickable(true);
            education.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this,Education.class);
                startActivity(intent);

            });
            ImageView hobbies = findViewById(R.id.hobbies);
            hobbies.setClickable(true);
            hobbies.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this,Hobbies.class);
                startActivity(intent);

            });
            ImageView contact = findViewById(R.id.contact);
            contact.setClickable(true);
            contact.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this,Contact.class);
                startActivity(intent);

            });

 }

}