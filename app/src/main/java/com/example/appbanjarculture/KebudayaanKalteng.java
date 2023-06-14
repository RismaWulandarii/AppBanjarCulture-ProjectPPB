package com.example.appbanjarculture;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class KebudayaanKalteng extends AppCompatActivity {

    LinearLayout rumahadat, pakaianadat, alatmusik, makanankhas;

    Button btnPrev;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kebudayaan_kalteng);

        rumahadat = findViewById(R.id.kebudayaankalteng_rumahadat);
        rumahadat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KebudayaanKalteng.this, KaltengRumahAdat_Betang.class));
            }
        });

        pakaianadat = findViewById(R.id.kebudayaankalteng_pakaianadat);
        pakaianadat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KebudayaanKalteng.this, KaltengPakaianAdat_Sangkurat.class));
            }
        });

        alatmusik = findViewById(R.id.kebudayaankalteng_alatmusik);
        alatmusik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KebudayaanKalteng.this, KaltengAlatMusik_Garantung.class));
            }
        });

        makanankhas = findViewById(R.id.kebudayaankalteng_makanan);
        makanankhas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KebudayaanKalteng.this, KaltengMakanan_Kalumpe.class));
            }
        });


        btnPrev = findViewById(R.id.btnPrev_kebudayaan_kalteng);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(getApplicationContext(), Kebudayaan.class);
                startActivity(kembali);
            }
        });
    }
}