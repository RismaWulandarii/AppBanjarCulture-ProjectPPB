package com.example.appbanjarculture;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KalbarAlatMusik_Entebong extends AppCompatActivity {

    Button btnPrev;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalbar_alat_musik_entebong);

        btnPrev = findViewById(R.id.btnPrev_alatmusik_kalbar);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(getApplicationContext(), KebudayaanKalbar.class);
                startActivity(kembali);
            }
        });
    }
}