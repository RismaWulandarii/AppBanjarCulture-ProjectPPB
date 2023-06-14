package com.example.appbanjarculture;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class KebudayaanKaltim extends AppCompatActivity {

    LinearLayout rumahadat, pakaianadat, alatmusik, makananadat;

    Button btnPrev;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kebudayaan_kaltim);

        rumahadat = findViewById(R.id.kebudayaankaltim_rumahadat);
        rumahadat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KebudayaanKaltim.this, KaltimRumahAdat_Lamin.class));
            }
        });

        pakaianadat = findViewById(R.id.kebudayaankaltim_pakaianadat);
        pakaianadat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KebudayaanKaltim.this, KaltimPakaianAdat_Takwo.class));
            }
        });

        alatmusik = findViewById(R.id.kebudayaankaltim_alatmusik);
        alatmusik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KebudayaanKaltim.this, KaltimAlatMusik_Sampek.class));
            }
        });

        makananadat = findViewById(R.id.kebudayaankaltim_makanan);
        makananadat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KebudayaanKaltim.this, KaltimMakanan_NasiBekepor.class));
            }
        });

        btnPrev = findViewById(R.id.btnPrev_kebudayaan_kaltim);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(getApplicationContext(), Kebudayaan.class);
                startActivity(kembali);
            }
        });
    }
}