package com.example.allan.euserve.Activity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.allan.euserve.R;


public class MainActivity extends AppCompatActivity {
   
    private Button abrirCad;
    private Button abrirLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        abrirCad=(Button) findViewById(R.id.button5);
        abrirCad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntentAbrirTelaCad= new Intent(MainActivity.this,Cadastro.class);
                startActivity(IntentAbrirTelaCad);
            }
        });


        abrirLog=(Button) findViewById(R.id.button13);
        abrirLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntentAbrirTelaLog=new Intent(MainActivity.this,Login.class);
                startActivity(IntentAbrirTelaLog);
            }
        });



    }



}
