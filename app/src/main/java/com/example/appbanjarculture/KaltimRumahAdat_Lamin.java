package com.example.appbanjarculture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KaltimRumahAdat_Lamin extends AppCompatActivity {

    Button btnPrev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaltim_rumah_adat_lamin);

        btnPrev = findViewById(R.id.btnPrev_rumahAdat_kaltim);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(getApplicationContext(), KebudayaanKaltim.class);
                startActivity(kembali);
            }
        });
    }
}