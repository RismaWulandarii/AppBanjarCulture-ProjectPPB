package com.example.appbanjarculture;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Kebudayaan extends AppCompatActivity {

    LinearLayout kalsel, kaltim, kalut, kalbar, kalteng;
    Button btnPrev;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kebudayaan);

        kalsel = findViewById(R.id.kebudayaanKalsel);
        kalsel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Kebudayaan.this, KebudayaanKalsel.class));
            }
        });

        kaltim = findViewById(R.id.kebudayaanKaltim);
        kaltim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Kebudayaan.this, KebudayaanKaltim.class));
            }
        });

        kalut = findViewById(R.id.kebudayaanKalut);
        kalut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Kebudayaan.this, KebudayaanKalut.class));
            }
        });

        kalbar = findViewById(R.id.kebudayaanKalbar);
        kalbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Kebudayaan.this, KebudayaanKalbar.class));
            }
        });

        kalteng = findViewById(R.id.kebudayaanKalteng);
        kalteng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Kebudayaan.this, KebudayaanKalteng.class));
            }
        });

        btnPrev = findViewById(R.id.btnPrev_kebudayaan);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(kembali);
            }
        });
    }
}