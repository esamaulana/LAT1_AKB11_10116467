package com.example.esa.lat1_akb11_10116467;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

/*
 * NIM   : 10116467
 * NAMA  : esa maulana
 * KELAS : AKB-11
 * TGL   : 05/04/2019
 * */

public class biodata extends AppCompatActivity {


    EditText editNama, editUmur;
    Button btnMaju;

    private String KEY_NAME = "kamu";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        editNama = (EditText) findViewById(R.id.editNama);
        editUmur = (EditText) findViewById(R.id.editUmur);
        btnMaju = (Button) findViewById(R.id.btnMaju);

        btnMaju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = editNama.getText().toString();
                String umur = editUmur.getText().toString();

                boolean isEmpty = false;

                if ((TextUtils.isEmpty(nama)) || (TextUtils.isEmpty(umur))){
                    isEmpty = true;
                    editNama.setError("Isi dulu");
                }
                else {
                    Intent i = new Intent(biodata.this, sayhi.class);
                    i.putExtra(KEY_NAME, nama);
                    startActivity(i);
                }

            }
        });
    }
}
