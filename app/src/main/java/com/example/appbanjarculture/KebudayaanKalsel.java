package com.example.appbanjarculture;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class KebudayaanKalsel extends AppCompatActivity {

    LinearLayout rumahadat, pakaianadat, alatmusik, makanan;

    Button btnPrev;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kebudayaan_kalsel);

        rumahadat = findViewById(R.id.kebudayaankalsel_rumahadat);
        rumahadat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KebudayaanKalsel.this, KalselRumahAdat_BubunganTinggi.class));
            }
        });

        pakaianadat = findViewById(R.id.kebudayaankalsel_pakaianadat);
        pakaianadat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KebudayaanKalsel.this, KalselPakaianAdat_BagajahGamulingBaularLulut.class));
            }
        });

        alatmusik = findViewById(R.id.kebudayaankalsel_alatmusik);
        alatmusik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KebudayaanKalsel.this, KalselAlatMusik_Panting.class));
            }
        });

        makanan = findViewById(R.id.kebudayaanKalsel_makanan);
        makanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KebudayaanKalsel.this, KalselMakanan_SotoBanjar.class));
            }
        });

        btnPrev = findViewById(R.id.btnPrev_kebudayaan_kalsel);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(getApplicationContext(), Kebudayaan.class);
                startActivity(kembali);
            }
        });
    }
}