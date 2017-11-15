package com.example.allan.euserve.Ajuda;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.NavUtils;

import org.w3c.dom.Node;

/**
 * Created by allan on 20/10/17.
 * CI=Chave identificadora
 * CN=Chave Nome
 * IU=Identificador Usuario
 * NU=Nome Usuario
 */

public class OnOff {

    private Context context;
    private SharedPreferences preferences;
    private String arquivo="projetoeuserve.OnOff";
    private int modo=0;
    private SharedPreferences.Editor editor;


    private  final String  CI="IdentificadorUsuarioOn";
    private final String CN="NomeUsuarioOn";

    public OnOff(Context context) {
        this.context = context;
        preferences=context.getSharedPreferences(arquivo,modo);

        editor=preferences.edit();

    }

    public void SalvarUsuario(String IU,String NU){
        editor.putString(CI,IU);
        editor.putString(CN,NU);
        editor.commit();
    }

    public String getIdentificador(){
        return preferences.getString(CI,null);
    }

    public String getNome(){
        return preferences.getString(CN,null);
    }
}
