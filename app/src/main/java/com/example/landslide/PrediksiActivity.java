package com.example.landslide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrediksiActivity extends AppCompatActivity {

    public Button ButtonCib;
    public Button ButtonSuk;
    public Button ButtonPJ;
    public Button ButtonSid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prediksi);
        ButtonCib = findViewById(R.id.butCib);

        ButtonCib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrediksiActivity.this, CibitungActivity.class);
                startActivity(intent);
            }
        });
        ButtonSuk = findViewById(R.id.butSuk);

        ButtonSuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrediksiActivity.this, SukataniActivity.class);
                startActivity(intent);
            }
        });
        ButtonPJ = findViewById(R.id.butPJ);

        ButtonPJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrediksiActivity.this, PasirJambuActivity.class);
                startActivity(intent);
            }
        });

        ButtonSid = findViewById(R.id.butSid);

        ButtonSid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrediksiActivity.this, SidamuktiActivity.class);
                startActivity(intent);
            }
        });
    }
}