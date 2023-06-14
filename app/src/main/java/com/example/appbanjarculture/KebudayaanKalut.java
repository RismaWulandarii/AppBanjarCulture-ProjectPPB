package com.example.appbanjarculture;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class KebudayaanKalut extends AppCompatActivity {

    LinearLayout rumahadat, pakaianadat, alatmusik, makanankhas;

    Button btnPrev;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kebudayaan_kalut);

        rumahadat = findViewById(R.id.kebudayaankalut_rumahadat);
        rumahadat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KebudayaanKalut.this, KalutRumahAdat_Baloy.class));
            }
        });

        pakaianadat = findViewById(R.id.kebudayaankalut_pakaianadat);
        pakaianadat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KebudayaanKalut.this, KalutPakaianAdat_TaaDanSapeiSapaq.class));
            }
        });

        alatmusik = findViewById(R.id.kebudayaankalut_alatmusik);
        alatmusik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KebudayaanKalut.this, KalutAlatMusik_Gambang.class));
            }
        });

        makanankhas = findViewById(R.id.kebudayaankalut_makanan);
        makanankhas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KebudayaanKalut.this, KalutMakanan_KepitingSoka.class));
            }
        });


        btnPrev = findViewById(R.id.btnPrev_kebudayaan_kalut);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(getApplicationContext(), Kebudayaan.class);
                startActivity(kembali);
            }
        });
    }
}