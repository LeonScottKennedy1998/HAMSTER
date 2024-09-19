package com.example.pract2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FullActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_activity);

        ImageView imgIV = findViewById(R.id.imgIV);
        TextView nameTV = findViewById(R.id.nameTV);
        TextView descrTV = findViewById(R.id.descrTV);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String descr = intent.getStringExtra("descr");
        int img = intent.getIntExtra("img", 0);

        imgIV.setImageResource(img);
        nameTV.setText(name);
        descrTV.setText(descr);
    }
}
