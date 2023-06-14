package com.example.appbanjarculture;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class KebudayaanKalbar extends AppCompatActivity {

    LinearLayout rumahadat, pakaianadat, alatmusik, makanan;

    Button btnPrev;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kebudayaan_kalbar);

        rumahadat = findViewById(R.id.kebudayaankalbar_rumahadat);
        rumahadat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KebudayaanKalbar.this, KalbarRumahAdat_Radakng.class));
            }
        });

        pakaianadat = findViewById(R.id.kebudayaankalbar_pakaianadat);
        pakaianadat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KebudayaanKalbar.this, KalbarPakaianAdat_King.class));
            }
        });

        alatmusik = findViewById(R.id.kebudayaankalbar_alatmusik);
        alatmusik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KebudayaanKalbar.this, KalbarAlatMusik_Entebong.class));
            }
        });

        makanan = findViewById(R.id.kebudayaankalbar_makanan);
        makanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KebudayaanKalbar.this, KalbarMakanan_BuburPedas.class));
            }
        });

        btnPrev = findViewById(R.id.btnPrev_kebudayaan_kalbar);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(getApplicationContext(), Kebudayaan.class);
                startActivity(kembali);
            }
        });
    }
}