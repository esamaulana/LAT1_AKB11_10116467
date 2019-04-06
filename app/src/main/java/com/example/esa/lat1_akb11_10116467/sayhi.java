package com.example.esa.lat1_akb11_10116467;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/*
 * NIM   : 10116467
 * NAMA  : esa maulana
 * KELAS : AKB-11
 * TGL   : 05/04/2019
 * */

public class sayhi extends AppCompatActivity {

    private String KEY_NAME = "kamu";
    private String nama;
    TextView hi;
    Button btnBeres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayhi);

        hi = (TextView) findViewById(R.id.hai);

        Bundle extras = getIntent().getExtras();
        nama=extras.getString(KEY_NAME);
        hi.setText("Beres! Sekarang "+nama+" udah bisa ngecek penggunaan HP mu tiap hari buat bantu "+nama+" ngatur waktu :)");

        btnBeres = (Button) findViewById(R.id.btnBeres);
        btnBeres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
            }
        });

    }
}
