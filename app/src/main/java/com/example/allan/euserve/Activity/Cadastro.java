package com.example.allan.euserve.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.allan.euserve.Ajuda.Codificar;
import com.example.allan.euserve.Ajuda.OnOff;
import com.example.allan.euserve.FB.ConfigFB;
import com.example.allan.euserve.R;
import com.example.allan.euserve.User.Usuario;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;
import com.google.firebase.auth.FirebaseUser;

public class Cadastro extends AppCompatActivity {

    private EditText Cadnome;
    private EditText Cadnascimento;
    private EditText Cademail;
    private EditText Cadsenha;
    private EditText Cadsenha1;
    private RadioButton rbFemi;
    private RadioButton rbMasc;
    private Button enviar;
    private Button cancelar;
    private Usuario user;
    private FirebaseAuth autenticacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Cadnome=(EditText)findViewById(R.id.Cadnome);
        Cadnascimento=(EditText)findViewById(R.id.Cadnascimento);
        Cademail=(EditText)findViewById(R.id.Cademail);
        Cadsenha=(EditText)findViewById(R.id.Cadsenha);
        Cadsenha1=(EditText)findViewById(R.id.Cadsenha1);
        rbFemi=(RadioButton)findViewById(R.id.rbFemi);
        rbMasc=(RadioButton)findViewById(R.id.rbMasc);
        enviar=(Button)findViewById(R.id.enviar);
        cancelar=(Button)findViewById(R.id.cancelar);



        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Cadsenha.getText().toString().equals(Cadsenha1.getText().toString())){

                    user = new Usuario();
                    user.setNome(Cadnome.getText().toString());
                    user.setDataDeNasc(Cadnascimento.getText().toString());
                    user.setEmail(Cademail.getText().toString());
                    user.setSenha(Cadsenha.getText().toString());

                    if (rbMasc.isChecked()){
                        user.setSexo("Masculino");
                    }else{
                        user.setSexo("Feminino");
                    }

                    cadastrar();


                }else {
                    Toast.makeText(Cadastro.this,"Senhas não conferem",Toast.LENGTH_SHORT).show();
                }






            }
        });



    cancelar=(Button)findViewById(R.id.cancelar);{

            cancelar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent IntentAbrirTelaLog=new Intent(Cadastro.this,MainActivity.class);
                    startActivity(IntentAbrirTelaLog);
                }
            });
        }

    }


    private void cadastrar(){
        autenticacao= ConfigFB.getFirebaseAutenticacao();
        autenticacao.createUserWithEmailAndPassword(
                user.getEmail(),
                user.getSenha()
        ).addOnCompleteListener(Cadastro.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(Cadastro.this,"Usuario Cadastrado com Sucesso",Toast.LENGTH_LONG).show();

                    String Identificador= Codificar.codificacao(user.getEmail());
                    FirebaseUser usuariofirebase= task.getResult().getUser();
                    user.setId(Identificador);
                    user.save();

                    OnOff preferencias=new OnOff(Cadastro.this);
                    preferencias.SalvarUsuario(Identificador,user.getNome());


                    abrirHome();
                }else{
                    String error="";
                    try{
                        throw task.getException();
                    }catch (FirebaseAuthWeakPasswordException e){
                        error="Digite uma senha mais forte,contendo  no minimo 8 caracteres de letras e numeros";

                    }catch (FirebaseAuthInvalidCredentialsException e){
                        error="E-mail digitado e invalido,digite um novo E-mail";

                    }catch (FirebaseAuthUserCollisionException e){
                        error="O E-mail digitado ja esta cadastrado!";
                    }catch (Exception e){
                        error="Erro ao efetuar  o cadastro";
                        e.printStackTrace();
                    }
                    Toast.makeText(Cadastro.this,"Error" + error,Toast.LENGTH_LONG).show();

                }

            }
        });



    }

    public void abrirHome() {
        Intent intent = new Intent(Cadastro.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
}
