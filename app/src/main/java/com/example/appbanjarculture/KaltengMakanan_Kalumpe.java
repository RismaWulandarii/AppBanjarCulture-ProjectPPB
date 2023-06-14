package com.example.appbanjarculture;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KaltengMakanan_Kalumpe extends Activity {
    Button btnPrev;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalteng_makanan_kalumpe);

        btnPrev = findViewById(R.id.btnPrev_makanan_kalteng);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(getApplicationContext(), KebudayaanKalteng.class);
                startActivity(kembali);
            }
        });
    }
}
