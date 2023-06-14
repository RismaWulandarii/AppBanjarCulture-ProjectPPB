package com.example.appbanjarculture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KalutMakanan_KepitingSoka extends AppCompatActivity {

    Button btnPrev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalut_makanan_kepiting_soka);

        btnPrev = findViewById(R.id.btnPrev_makanan_kalut);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(getApplicationContext(), KebudayaanKalut.class);
                startActivity(kembali);
            }
        });
    }
}