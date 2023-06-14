package com.example.appbanjarculture;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Kuis extends AppCompatActivity {

    RadioButton radA, radB, radC, radD;
    String sQuiz = "";
    int ke = 0, ike = 0, jumsoal = 5, jumBenar = 0,jumSalah = 0;
    int jd;
    String[] arr_pertanyaan;
    String[] arr_jawabA;
    String[] arr_jawabB;
    String[] arr_jawabC;
    String[] arr_jawabD;
    String[] arr_jawabBenar;
    int[] arr_gambar;

    static final String KEY_record = "soal";
    public static final String KEY_pertanyaan = "pertanyaan";
    public static final String KEY_jawabA = "jawabA";
    public static final String KEY_jawabB = "jawabB";
    public static final String KEY_jawabC = "jawabC";
    public static final String KEY_jawabD = "jawabD";
    public static final String KEY_jawabBenar = "jawabBenar";
    public static final String KEY_gambar = "gambar";
    public static final String KEY_idsoal = "idsoal";

    ImageView imgGambar;
    TextView txtTanya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);

        txtTanya = (TextView) findViewById(R.id.txtTanya);
        imgGambar = (ImageView) findViewById(R.id.myGambar);

        setData();


        radA = (RadioButton) findViewById(R.id.radA);
        radA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cekJawaban("A");
                ke = ke + 1;
                ike = ike + 1;
                if (ke >= jumsoal) {
                    selesai();
                } else {
                    lihat();
                }
            }
        });

        radB = (RadioButton) findViewById(R.id.radB);
        radB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cekJawaban("B");
                ke = ke + 1;
                ike = ike + 1;
                if (ke >= jumsoal) {
                    selesai();
                } else {
                    lihat();
                }
            }
        });
        radC = (RadioButton) findViewById(R.id.radC);
        radC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cekJawaban("C");
                ke = ke + 1;
                ike = ike + 1;
                if (ke >= jumsoal) {
                    selesai();
                } else {
                    lihat();
                }
            }
        });
        radD = (RadioButton) findViewById(R.id.radD);
        radD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cekJawaban("D");
                ke = ke + 1;
                ike = ike + 1;
                if (ke >= jumsoal) {
                    selesai();
                } else {
                    lihat();
                }
            }
        });
        lihat();
    }

    void cekJawaban(String pil) {
        if (arr_jawabBenar[ike].equalsIgnoreCase(pil)) {
            jumBenar = jumBenar + 1;
            sQuiz = sQuiz + "Soal ke-" + (ke + 1) + " Benar\n";
            Toast.makeText(getBaseContext(), " Pilihan Anda " + pil + " : Benar!", Toast.LENGTH_SHORT).show();
        } else {
            jumSalah= jumSalah+ 1;
            sQuiz = sQuiz + "Soal ke-" + (ke + 1) + " Salah\n";
            Toast.makeText(getBaseContext(), " Pilihan Anda " + pil + " : Salah!", Toast.LENGTH_SHORT).show();
        }
    }

    void lihat() {
        Random rand = new Random();
        radA.setChecked(false);
        radB.setChecked(false);
        radC.setChecked(false);
        radD.setChecked(false);
        ike = rand.nextInt(15);
        txtTanya.setText((ke + 1) + "." + arr_pertanyaan[ike]);
        radA.setText(arr_jawabA[ike]);
        radB.setText(arr_jawabB[ike]);
        radC.setText(arr_jawabC[ike]);
        radD.setText(arr_jawabD[ike]);
        //	txtTanyake.setText("Pertanyaan ke "+(ke+1) +" dari "+jumsoal+" pertanyaan !");
        imgGambar.setImageResource(arr_gambar[ike]);
    }


    public void selesai() {
        int nilai=0;
        nilai=jumBenar*20;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Hasil Nilai");
        builder.setMessage("Total Soal : "+ jumsoal+"\n" +
                "Benar : "+ jumBenar+"\n" +
                "Salah : "+jumSalah+"\n" +
                "Nilai : "+nilai);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //finish();
                Intent intent = new Intent(Kuis.this, MainActivity.class);
                startActivity(intent);
            }
        });
        builder.show();
    }


    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    void setData() {
        jd = 15;
        arr_pertanyaan = new String[jd];
        arr_jawabA = new String[jd];
        arr_jawabB = new String[jd];
        arr_jawabC = new String[jd];
        arr_jawabD = new String[jd];
        arr_jawabBenar = new String[jd];
        arr_gambar = new int[jd];


        arr_pertanyaan[0] = "Pada gambar diatas merupakan rumah adat..?";
        arr_jawabA[0] = "A. Bumbungan Tinggi";
        arr_jawabB[0] = "B. Lamin";
        arr_jawabC[0] = "C. Betang";
        arr_jawabD[0] = "D. Baloy";
        arr_jawabBenar[0] = "A";
        arr_gambar[0] =R.drawable.rumahadat_kalsel_bubungantinggi;


        arr_pertanyaan[1] = "Pada gambar diatas merupakan baju adat dari..?";
        arr_jawabA[1] = "Kalimnatan Utara";
        arr_jawabB[1] = "Kalimantan Barat";
        arr_jawabC[1] = "Kalimantan Tengah";
        arr_jawabD[1] = "Kalimantan Selatan";
        arr_jawabBenar[1] = "D";
        arr_gambar[1] =R.drawable.bajuadat_kalsel_bagajahgamulingbaularlulut;

        arr_pertanyaan[2] = "Pada gambar diatas merupakan alat musik..?";
        arr_jawabA[2] = "Gitar";
        arr_jawabB[2] = "Biola";
        arr_jawabC[2] = "Panting";
        arr_jawabD[2] = "Angklung";
        arr_jawabBenar[2] = "C";
        arr_gambar[2] =R.drawable.alatmusik_kalsel_panting;


        arr_pertanyaan[3] = "Pada gambar diatas merupakan rumah adat..?";
        arr_jawabA[3] = "Lamin";
        arr_jawabB[3] = "Bubungan Tinggi";
        arr_jawabC[3] = "Betang";
        arr_jawabD[3] = "Baloy";
        arr_jawabBenar[3] = "A";
        arr_gambar[3] =R.drawable.rumahadat_kaltim_lamin;

        arr_pertanyaan[4] = "Pada gambar diatas merupakan alat musik..?";
        arr_jawabA[4] = "Sampek";
        arr_jawabB[4] = "Panting";
        arr_jawabC[4] = "Babun";
        arr_jawabD[4] = "Tuma";
        arr_jawabBenar[4] = "A";
        arr_gambar[4] =R.drawable.alatmusik_kaltim_sampek;

        arr_pertanyaan[5] = "Pada gambar diatas merupakan baju adat..?";
        arr_jawabA[5] = "Basulau";
        arr_jawabB[5] = "Sangkurat";
        arr_jawabC[5] = "Takwo";
        arr_jawabD[5] = "King";
        arr_jawabBenar[5] = "C";
        arr_gambar[5] =R.drawable.bajuadat_kaltim_takwo;

        arr_pertanyaan[6] = "Pada gambar diatas merupakan rumah adat..?";
        arr_jawabA[6] = "Lamin";
        arr_jawabB[6] = "Radakng";
        arr_jawabC[6] = "Betang";
        arr_jawabD[6] = "Baloy";
        arr_jawabBenar[6] = "B";
        arr_gambar[6] =R.drawable.rumahadat_kalbar_radakng;

        arr_pertanyaan[7] = "Pada gambar diatas merupakan baju adat dari..?";
        arr_jawabA[7] = "Kalimantan Barat";
        arr_jawabB[7] = "Kalimantan Timur";
        arr_jawabC[7] = "Kalimantan Selatan";
        arr_jawabD[7] = "Kalimantan Utara";
        arr_jawabBenar[7] = "A";
        arr_gambar[7] =R.drawable.bajuadat_kalbar_king;

        arr_pertanyaan[8] = "Pada gambar diatas merupakan alat musik..?";
        arr_jawabA[8] = "Babun";
        arr_jawabB[8] = "Entebong";
        arr_jawabC[8] = "Rebana";
        arr_jawabD[8] = "Sasando";
        arr_jawabBenar[8] = "B";
        arr_gambar[8] =R.drawable.alatmusik_kalbar_entebong;

        arr_pertanyaan[9] = "Pada gambar diatas merupakan rumah adat..?";
        arr_jawabA[9] = "Betang";
        arr_jawabB[9] = "Lamin";
        arr_jawabC[9] = "Bunbungan Tinggi";
        arr_jawabD[9] = "Baloy";
        arr_jawabBenar[9] = "A";
        arr_gambar[9] =R.drawable.rumahadat_kalteng_betang;

        arr_pertanyaan[10] = "Pada gambar diatas merupakan baju adat..?";
        arr_jawabA[10] = "Sangkurat";
        arr_jawabB[10] = "Basulau";
        arr_jawabC[10] = "King";
        arr_jawabD[10] = "Takwo";
        arr_jawabBenar[10] = "A";
        arr_gambar[10] =R.drawable.bajuadat_kalteng_sangkurat;

        arr_pertanyaan[11] = "Pada gambar diatas merupakan alat musik..?";
        arr_jawabA[11] = "Garantung";
        arr_jawabB[11] = "Biola";
        arr_jawabC[11] = "Sampek";
        arr_jawabD[11] = "Entenbong";
        arr_jawabBenar[11] = "A";
        arr_gambar[11] =R.drawable.alatmusik_kalteng_garantung;

        arr_pertanyaan[12] = "Pada gambar diatas merupakan rumah adat..?";
        arr_jawabA[12] = "Baloy";
        arr_jawabB[12] = "Betang";
        arr_jawabC[12] = "Gadang";
        arr_jawabD[12] = "Lumin";
        arr_jawabBenar[12] = "A";
        arr_gambar[12] =R.drawable.rumahadat_kalut_baloy;

        arr_pertanyaan[13] = "Pada gambar diatas merupakan baju adat..?";
        arr_jawabA[13] = "Ta'a & Sapei Sapaq";
        arr_jawabB[13] = "Jua'a";
        arr_jawabC[13] = "King Tawo";
        arr_jawabD[13] = "Sangkurat";
        arr_jawabBenar[13] = "A";
        arr_gambar[13] =R.drawable.bajuadat_kalut_taasapeisapaq;

        arr_pertanyaan[14] = "Pada gambar diatas merupakan alat musik..?";
        arr_jawabA[14] = "Gambang";
        arr_jawabB[14] = "Gendang";
        arr_jawabC[14] = "Gitar";
        arr_jawabD[14] = "Gong";
        arr_jawabBenar[14] = "A";
        arr_gambar[14] =R.drawable.alatmusik_kalut_gambang;
    }
}