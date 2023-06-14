package com.example.appbanjarculture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KalutRumahAdat_Baloy extends AppCompatActivity {

    Button btnPrev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalut_rumah_adat_baloy);

        btnPrev = findViewById(R.id.btnPrev_rumahAdat_kalut);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(getApplicationContext(), KebudayaanKalut.class);
                startActivity(kembali);
            }
        });
    }
}