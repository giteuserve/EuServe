package com.example.allan.euserve.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.allan.euserve.FB.ConfigFB;
import com.example.allan.euserve.R;
import com.example.allan.euserve.User.Usuario;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;


public class Login extends AppCompatActivity {

    private EditText edtEmail;
    private EditText edtSenha;
    private TextView textView2;
    private TextView textView;
    private Button Ent2;
    private FirebaseAuth autenticacao;
    private Usuario usuario;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        edtEmail=(EditText) findViewById(R.id.edtEmail);
        edtSenha=(EditText) findViewById(R.id.editSenha);
        textView2=(TextView)findViewById(R.id.textView2);
        textView=(TextView)findViewById(R.id.textView3);
        Ent2=(Button) findViewById(R.id.Ent2);



        Ent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!edtEmail.getText().toString().equals("") && !edtSenha.getText().toString().equals("")){

                    usuario=new Usuario();
                    usuario.setEmail(edtEmail.getText().toString());
                    usuario.setSenha(edtSenha.getText().toString());

                    validar();



                }
                else {
                    Toast.makeText(Login.this,"Preencha o E-mail ou Senha",Toast.LENGTH_SHORT).show();


                }
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cadastrar();
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recu=new Intent(Login.this,TrocarSenha.class);
                startActivity(recu);
            }
        });

    }
    private void validar(){
        autenticacao= ConfigFB.getFirebaseAutenticacao();
        autenticacao.signInWithEmailAndPassword(usuario.getEmail(), usuario.getSenha()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    abrirTL();
                    Toast.makeText(Login.this,"Login Efetuado Com Sucesso",Toast.LENGTH_SHORT).show();
                    edtEmail.setText("");
                    edtSenha.setText("");
                }else{

                    Toast.makeText(Login.this,"Login ou senha inseridos está incorreto(s). ",Toast.LENGTH_SHORT).show();
                    edtEmail.setText("");
                    edtSenha.setText("");

                }

            }
        });

    }

    private void abrirTL(){
        Intent abrirTelaP=new Intent(Login.this,AvInicial.class);
        startActivity(abrirTelaP);
    }


    private void cadastrar(){
        Intent cadastrarUsuario=new Intent(Login.this,Cadastro.class);
        startActivity(cadastrarUsuario);

    }

}
