package com.example.nam.basededonnees;

import android.app.Dialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ThirdActivity extends ActionBarActivity implements View.OnClickListener {



    private Button button2;

    private Dialog dialog;

    private EditText loginu;
    private EditText passu;
    private EditText idu;
    UserManager um;


    //constructor

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);




        button2 = (Button) findViewById(R.id.fourth_formation_ajouter_contact);
        button2.setOnClickListener(this);



    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestoy", Toast.LENGTH_LONG).show();
    }
    private Dialog createCustomDialog(){
        final Dialog dialog = new Dialog( ThirdActivity.this);
        dialog.setContentView(R.layout.custom_item_fourth_formation);
        //dialog.setTitle(getString(R.string.title_activity_third));
        dialog.setTitle("Ajout d'un contact");

        Button button2 = (Button) dialog.findViewById(R.id.custom_item_fourth_formation_encore_un_nouveau);
        button2.setOnClickListener(this);

        loginu = (EditText) dialog.findViewById(R.id.custom_item_fourth_formation_login);
        passu = (EditText) dialog.findViewById(R.id.custom_item_fourth_formation_motdepasse);
        idu = (EditText) dialog.findViewById(R.id.custom_item_fourth_formation_type);

        return dialog;
    }

    @Override
    public void onClick(View v) {
        switch ( v.getId() )
        {
            case R.id.fourth_formation_ajouter_contact:

                dialog = createCustomDialog();
                dialog.show();

                break;

            case R.id.custom_item_fourth_formation_encore_un_nouveau:


                um.open();
                utilisateur u = new utilisateur(1,"bonjour","hey");
                String login = loginu.getText().toString();
                String pass = passu.getText().toString();
                int id2 = Integer.parseInt(idu.getText().toString());


                u.setLogin(login);
                u.setPass(pass);
                u.setId(id2);

                long lg= um.AddUser(u);

                um.close();
                Toast.makeText(this,lg +"lignes a été ajouté", Toast.LENGTH_LONG ).show();

                dialog.dismiss();



                break;
        }
    }

}
