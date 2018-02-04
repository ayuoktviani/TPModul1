package com.example.android.ayusaraswati_1202154290_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView nama, harga, porsi, menu;
    private int uang = 65000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        nama = findViewById(R.id.textView4);
        harga = findViewById(R.id.textView6);
        porsi = findViewById(R.id.textView8);
        menu = findViewById(R.id.textView10);

        Intent intent = getIntent();
        String rNama = intent.getStringExtra("textView4");
        nama.setText(rNama);

        String rHarga = intent.getStringExtra("textView6");

        String rPorsi = intent.getStringExtra("textView8");
        porsi.setText(rPorsi);

        String rMenu = intent.getStringExtra("textView10");
        menu.setText(rMenu);

        int jumlahbayar = Integer.valueOf(rHarga) * Integer.valueOf(rPorsi);
        harga.setText(String.valueOf(jumlahbayar));

        if(jumlahbayar <= uang) {
            Toast.makeText(this, "Makan malam kamu disini saja", 1).show();
        } else{
            Toast.makeText(this, "Jangan makan disini, uang kamu tidak cukup", 1).show();

        }
    }
}
