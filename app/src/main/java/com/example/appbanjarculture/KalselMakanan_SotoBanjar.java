package com.example.appbanjarculture;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class KalselMakanan_SotoBanjar extends AppCompatActivity {

    Button btnPrev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalsel_makanan_soto_banjar);

        btnPrev = findViewById(R.id.btnPrev_makanan_kalsel);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(getApplicationContext(), KebudayaanKalsel.class);
                startActivity(kembali);
            }
        });
    }
}