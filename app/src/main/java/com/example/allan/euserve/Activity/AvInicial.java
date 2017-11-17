package com.example.allan.euserve.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.allan.euserve.R;

public class AvInicial extends AppCompatActivity {
    private Button instrucao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_av_inicial);




        instrucao=(Button) findViewById(R.id.button4);
        instrucao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntentAbrirTelaCad= new Intent(AvInicial.this,AvFinal.class);
                startActivity(IntentAbrirTelaCad);
            }
        });
    }

}
