package com.example.allan.euserve.Ajuda;

import android.util.Base64;

/**
 * Created by allan on 20/10/17.
 */

public class Codificar {

    public static String codificacao(String texto){
        return Base64.encodeToString(texto.getBytes(),Base64.DEFAULT).replaceAll("(\\n|\\r)", "");
    }

    public static String decodificacao(String textocod){
        return new String(Base64.decode(textocod,Base64.DEFAULT));
    }
}
