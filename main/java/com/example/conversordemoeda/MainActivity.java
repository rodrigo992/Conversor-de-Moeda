package com.example.conversordemoeda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_euros;
    Button bt_dolar, bt_real, bt_kwanza;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_euros= findViewById(R.id.et_valoreuros);
        bt_dolar= findViewById(R.id.bt_dolar);
        bt_real= findViewById(R.id.bt_real);
        bt_kwanza= findViewById(R.id.bt_Kwanza);


        bt_real.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double veuros = Double.parseDouble(et_euros.getText().toString());
                double vreal = veuros * 6.38;
                Toast.makeText(MainActivity.this,veuros + "€ são " + vreal + "R$", Toast.LENGTH_SHORT).show();
            }
        });



        bt_dolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double veuros = Double.parseDouble(et_euros.getText().toString());
                double vdolar = veuros * 1.22;
                Toast.makeText(MainActivity.this,veuros + "€ são " + vdolar + "$", Toast.LENGTH_SHORT).show();

            }
        });


        bt_kwanza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double veuros = Double.parseDouble(et_euros.getText().toString());
                double vkwanza = veuros * 795.87;
                Toast.makeText(MainActivity.this,veuros + "€ são " + vkwanza + "KZ", Toast.LENGTH_SHORT).show();

            }
        });











    }
}