package com.example.allan.euserve.Activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.allan.euserve.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

public class TrocarSenha extends AppCompatActivity {
    private Button  button;
    private TextView email;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trocar_senha);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        firebaseAuth = FirebaseAuth.getInstance();
    }
    @Override
    protected void onResume() {
        super.onResume();
        init();
    }

    private void init(){
       button=(Button) findViewById(R.id.Reset);
        email = (TextView) findViewById(R.id.Email);
    }

    public void reset( View view ) {
        firebaseAuth
                .sendPasswordResetEmail(email.getText().toString())
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            email.setText("");
                            Toast.makeText(TrocarSenha.this, "Recuperacao de acesso iniciada.E-mail enviado.", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(TrocarSenha.this, "E-mail invalido,por favor tente novamente!!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });


    }


}


