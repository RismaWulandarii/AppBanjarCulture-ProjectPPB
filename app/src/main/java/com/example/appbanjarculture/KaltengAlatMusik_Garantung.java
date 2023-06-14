package com.example.appbanjarculture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KaltengAlatMusik_Garantung extends AppCompatActivity {

    Button btnPrev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalteng_alat_musik_garantung);

        btnPrev = findViewById(R.id.btnPrev_alatmusik_kalteng);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(getApplicationContext(), KebudayaanKalteng.class);
                startActivity(kembali);
            }
        });
    }
}