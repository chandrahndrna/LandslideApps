package com.example.landslide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MetodeActivity extends AppCompatActivity {

    public Button ButtonGeof;
    public Button ButtonGeot;
    public Button ButtonPred;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metode);
        ButtonGeof = findViewById(R.id.butGeofisika);

        ButtonGeof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MetodeActivity.this, GeofisikaActivity.class);
                startActivity(intent);
            }
        });
        ButtonGeot = findViewById(R.id.butGeoteknik);

        ButtonGeot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MetodeActivity.this, GeoteknikActivity.class);
                startActivity(intent);
            }
        });
        ButtonPred = findViewById(R.id.butPrediksi);

        ButtonPred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MetodeActivity.this, MetodePrediksiActivity.class);
                startActivity(intent);
            }
        });
    }
}