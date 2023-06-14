package com.example.appbanjarculture;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KalselPakaianAdat_BagajahGamulingBaularLulut extends AppCompatActivity {

    Button btnPrev;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalsel_pakaian_adat_bagajah_gamuling_baular_lulut);

        btnPrev = findViewById(R.id.btnPrev_pakaianAdat_kalsel);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(getApplicationContext(), KebudayaanKalsel.class);
                startActivity(kembali);
            }
        });
    }
}