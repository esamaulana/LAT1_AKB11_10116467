package com.example.esa.lat1_akb11_10116467;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
 * NIM   : 10116467
 * NAMA  : esa maulana
 * KELAS : AKB-11
 * TGL   : 05/04/2019
 * */

public class welcome extends AppCompatActivity {

    Button btnMulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btnMulai = (Button) findViewById(R.id.btnMulai);
        btnMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(welcome.this, loginCode.class);
                startActivity(i);
            }
        });


    }
}
