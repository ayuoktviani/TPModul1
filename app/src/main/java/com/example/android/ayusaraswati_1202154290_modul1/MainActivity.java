package com.example.android.ayusaraswati_1202154290_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText xMenu, xPorsi;
    Button xEatbus, xAbnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        xMenu = findViewById(R.id.editText);
        xPorsi = findViewById(R.id.editText2);
        xEatbus = findViewById(R.id.button);
        xAbnormal = findViewById(R.id.button2);
    }

    public void launchEatbus(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("textView4",xEatbus.getText().toString() );
        intent.putExtra("textView10",xMenu.getText().toString() );
        intent.putExtra("textView8",xPorsi.getText().toString() );
        intent.putExtra("textView6","50000");
        startActivity(intent);

    }

    public void launchAbnormal(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("textView4",xAbnormal.getText().toString() );
        intent.putExtra("textView10",xMenu.getText().toString() );
        intent.putExtra("textView8",xPorsi.getText().toString() );
        intent.putExtra("textView6","30000");
        startActivity(intent);
    }
}

