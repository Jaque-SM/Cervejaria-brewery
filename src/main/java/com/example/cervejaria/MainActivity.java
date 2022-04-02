package com.example.cervejaria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //criar um button
        Button ab= (Button) findViewById(R.id.button);

        //setar o button para dentro de um click
        ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               TextView ass= (TextView) findViewById(R.id.textView);

               //chama spinner
                Spinner ad=(Spinner) findViewById(R.id.spinner);

                //setar todas as strings
                 String cor=ad.getSelectedItem().toString();

                 //executa o metodo de listar strings do array,
                 ass.setText(new ExperctCerveja().getMarcas(cor).toString());







            }
        });



    }
















}