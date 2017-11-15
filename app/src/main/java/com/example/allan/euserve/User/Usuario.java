package com.example.allan.euserve.User;

import com.example.allan.euserve.FB.ConfigFB;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by allan on 15/10/17.
 */

public class Usuario {
    private String id;
    private String email;
    private String senha;
    private String nome;
    private String dataDeNasc;
    private String sexo;

    public Usuario() {
    }

    public void save(){

        DatabaseReference ref= ConfigFB.getFB();
        ref.child("usuario").child(String.valueOf(getId())).setValue(this);
    }

    @Exclude
    public Map<String, Object>tomap(){
        HashMap<String,Object> hashMapUsuario=new HashMap<>();

        hashMapUsuario.put("id",getId());
        hashMapUsuario.put("email",getEmail());
        hashMapUsuario.put("senha",getSenha());
        hashMapUsuario.put("nome",getNome());
        hashMapUsuario.put("dataDeNasc",getDataDeNasc());
        hashMapUsuario.put("sexo ",getSexo());

        return hashMapUsuario;


    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNasc() {
        return dataDeNasc;
    }

    public void setDataDeNasc(String dataDeNasc) {
        this.dataDeNasc = dataDeNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
