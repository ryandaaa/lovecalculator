package com.ryandadev.lovecalculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StringBuilder lelaki = new StringBuilder();
        StringBuilder perempuan = new StringBuilder();

        Button tombolHitung = findViewById(R.id.button2);
        EditText namaLaki = findViewById(R.id.editTextTextEmailAddress);
        EditText namaPerempuan = findViewById(R.id.editTextTextEmailAddress2);
        EditText persentaseCocok = findViewById(R.id.editTextText);

        tombolHitung.setOnClickListener(view -> {
            double persentase = Math.random() * 100;

            lelaki.delete(0, lelaki.length());
            perempuan.delete(0, perempuan.length());

            lelaki.append(namaLaki.getText());
            perempuan.append(namaPerempuan.getText());

            if (lelaki.toString().equalsIgnoreCase("Ryanda") && perempuan.toString().equalsIgnoreCase("Alya")) {
                persentaseCocok.setText("100% cocok no doubt utk nyata <3");
            }
            else if (lelaki.toString().equalsIgnoreCase("") && perempuan.toString().equalsIgnoreCase("")) {
                persentaseCocok.setText("isi dlu woi");
            }
            else if (lelaki.toString().equalsIgnoreCase("")) {
                persentaseCocok.setText("nama lakinya mana");
            }
            else if (perempuan.toString().equalsIgnoreCase("")) {
                persentaseCocok.setText("nama perempuannya mana");
            }
            else {
                persentaseCocok.setText(String.valueOf((int) persentase) + "%");
            }
        });
    }
}
