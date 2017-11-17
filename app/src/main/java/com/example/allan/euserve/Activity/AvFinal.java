package com.example.allan.euserve.Activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.allan.euserve.R;

public class AvFinal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_av_final);
    }

    public void tipo1a(View view) {
        String[] s = {"Quebradiço ", "Ressecado", "Oleoso", "Com pontas duplas"};
        final ArrayAdapter<String> adp = new ArrayAdapter<String>(AvFinal.this,
                android.R.layout.simple_spinner_item, s);

        final Spinner sp = new Spinner(AvFinal.this);
        sp.setLayoutParams(new LinearLayout.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT));
        sp.setAdapter(adp);

        final AlertDialog.Builder builder = new AlertDialog.Builder(AvFinal.this);
        builder.setView(sp);
        builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                String msg;
                if(sp.getSelectedItemId() == 0)
                    //se eu for chamar uma outra pagina, tiro o toast e chamo startactivity
                    Toast.makeText(AvFinal.this, "Vc pode usar tonificante, " +
                            "comer alimento que tenha vitaminas E, hidratar com produtos a base de argan queratina e uréia ", Toast.LENGTH_LONG).show();
                    // msg = "Vc pode usar tonificante";
                else if (sp.getSelectedItemId()==1)
                    Toast.makeText(AvFinal.this, "Utilizar produtos que tenham d-pantenol, óleo de Gérmen", Toast.LENGTH_LONG).show();
                    // msg = "Use óleo de côco e hidratação a base de abacate ";
                else if (sp.getSelectedItemId()==2)
                    // msg="Usa reconstrutor com babosa e ovo";
                    Toast.makeText(AvFinal.this, "Lavar os cabelos com água morna, aplicar tônicos de lho, extrato de Jaborandi", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(AvFinal.this, "Usar mácaras capilares com vitminas A e E, Aloe vera e Pantenol", Toast.LENGTH_LONG).show();



            }
        });

        builder.setNegativeButton("Negativo", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(AvFinal.this, "Voltando!", Toast.LENGTH_LONG).show();
            }
        });
        builder.create().show();

    }

    public void tipo2b(View view) {
        String[] s = {"Quebradiço ", "Ressecado", "Oleoso", "Com pontas duplas"};
        final ArrayAdapter<String> adp = new ArrayAdapter<String>(AvFinal.this,
                android.R.layout.simple_spinner_item, s);

        final Spinner sp = new Spinner(AvFinal.this);
        sp.setLayoutParams(new LinearLayout.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT));
        sp.setAdapter(adp);

        final AlertDialog.Builder builder = new AlertDialog.Builder(AvFinal.this);
        builder.setView(sp);
        builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                // Toast.makeText(MainActivity.this, "Vc pode usar: óleo de côco e hidratações a base de abacate", Toast.LENGTH_LONG).show();
                if(sp.getSelectedItemId() == 0)
                    //se eu for chamar uma outra pagina, tiro o toast e chamo startactivity
                    Toast.makeText(AvFinal.this, "Vc pode usar tonificante, " +
                            "comer alimento que tenha vitaminas E, hidratar com produtos a base de argan queratina e uréia ", Toast.LENGTH_LONG).show();
                    // msg = "Vc pode usar tonificante";
                else if (sp.getSelectedItemId()==1)
                    Toast.makeText(AvFinal.this, "Utilizar produtos que tenham d-pantenol, óleo de Gérmen", Toast.LENGTH_LONG).show();
                    // msg = "Use óleo de côco e hidratação a base de abacate ";
                else if (sp.getSelectedItemId()==2)
                    // msg="Usa reconstrutor com babosa e ovo";
                    Toast.makeText(AvFinal.this, "Lavar os cabelos com água morna, aplicar tônicos de alho, extrato de Jaborandi", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(AvFinal.this, "Usar mácaras capilares com vitminas A e E, Aloe vera e Pantenol, aparar as pontas de 2 em 2 meses", Toast.LENGTH_LONG).show();


            }
        });

        builder.setNegativeButton("Negativo", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(AvFinal.this, "Voltando!", Toast.LENGTH_LONG).show();
            }
        });
        builder.create().show();

    }

    public void tipo3a(View view) {
        String[] s = {"Quebradiço ", "Ressecado", "Com corte químico ", "Com pontas duplas"};
        final ArrayAdapter<String> adp = new ArrayAdapter<String>(AvFinal.this,
                android.R.layout.simple_spinner_item, s);

        final Spinner sp = new Spinner(AvFinal.this);
        sp.setLayoutParams(new LinearLayout.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT));
        sp.setAdapter(adp);

        final AlertDialog.Builder builder = new AlertDialog.Builder(AvFinal.this);
        builder.setView(sp);
        builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                // Toast.makeText(MainActivity.this, "Vc pode usar babosa", Toast.LENGTH_LONG).show();
                if(sp.getSelectedItemId() == 0)
                    //se eu for chamar uma outra pagina, tiro o toast e chamo startactivity
                    Toast.makeText(AvFinal.this, "Vc pode usar tonificante, " +
                            "comer alimento que tenha vitaminas E, hidratar com produtos a base de argan queratina e uréia ", Toast.LENGTH_LONG).show();
                    // msg = "Vc pode usar tonificante";
                else if (sp.getSelectedItemId()==1)
                    Toast.makeText(AvFinal.this, "Utilizar produtos que tenham d-pantenol, óleo de Gérmen", Toast.LENGTH_LONG).show();
                    // msg = "Use óleo de côco e hidratação a base de abacate ";
                else if (sp.getSelectedItemId()==2)
                    // msg="Usa reconstrutor com babosa e ovo";
                    Toast.makeText(AvFinal.this, "Lavar os cabelos com água morna, aplicar tônicos de lho, extrato de Jaborandi", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(AvFinal.this, "Usar mácaras capilares com vitminas A e E, Aloe vera e Pantenol", Toast.LENGTH_LONG).show();





            }
        });

        builder.setNegativeButton("Negativo", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(AvFinal.this, "Voltando!", Toast.LENGTH_LONG).show();
            }
        });
        builder.create().show();

    }

    public void tipo4a(View view) {
        String[] s = {"Quebradiço ", "Ressecado", "Com corte químico ", "Com pontas duplas"};
        final ArrayAdapter<String> adp = new ArrayAdapter<String>(AvFinal.this,
                android.R.layout.simple_spinner_item, s);

        final Spinner sp = new Spinner(AvFinal.this);
        sp.setLayoutParams(new LinearLayout.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT));
        sp.setAdapter(adp);

        final AlertDialog.Builder builder = new AlertDialog.Builder(AvFinal.this);
        builder.setView(sp);
        builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                //  Toast.makeText(MainActivity.this, "Vc pode usar: óleo de côco e hidratações a base de abacate", Toast.LENGTH_LONG).show();
                if(sp.getSelectedItemId() == 0)
                    //se eu for chamar uma outra pagina, tiro o toast e chamo startactivity
                    Toast.makeText(AvFinal.this, "Vc pode usar tonificante, " +
                            "e hidratar com produtos com ervas naturais: babosa, urtiga, jaborandi", Toast.LENGTH_LONG).show();
                    // msg = "Vc pode usar tonificante";
                else if (sp.getSelectedItemId()==1)
                    Toast.makeText(AvFinal.this, "Aplicar óleos vegetais: óleo de côco, ríssino, azeite de oliva e fazer umectação antes de lavar", Toast.LENGTH_LONG).show();
                    // msg = "Use óleo de côco e hidratação a base de abacate ";
                else if (sp.getSelectedItemId()==2)
                    // msg="Usa reconstrutor com babosa e ovo";
                    Toast.makeText(AvFinal.this, "Aplicar recostrutores, alimentos ricos em ferro e fibra", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(AvFinal.this, "Usar mácaras capilares com vitminas A e E, Aloe vera e Pantenol", Toast.LENGTH_LONG).show();

            }
        });

        builder.setNegativeButton("Negativo", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(AvFinal.this, "Voltando!", Toast.LENGTH_LONG).show();
            }
        });
        builder.create().show();

    }


}
