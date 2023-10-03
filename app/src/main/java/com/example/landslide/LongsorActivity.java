package com.example.landslide;

import  androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class LongsorActivity extends AppCompatActivity {

    public Button ButtonDef;
    public Button ButtonFak;
    public Button ButtonJen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longsor);

        ButtonDef = findViewById(R.id.butDefinisi);

        ButtonDef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LongsorActivity.this, DefinisiActivity.class);
                startActivity(intent);
            }
        });
        ButtonFak = findViewById(R.id.butFaktor);

        ButtonFak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LongsorActivity.this, FaktorActivity.class);
                startActivity(intent);
            }
        });
        ButtonJen = findViewById(R.id.butJenis);

        ButtonJen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LongsorActivity.this, JenisActivity.class);
                startActivity(intent);
            }
        });
    }
}