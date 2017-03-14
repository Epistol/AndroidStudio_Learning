package com.example.mlebeau.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Pokemon> pokedex = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonmap = (Button)findViewById(R.id.buttonmap);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                cliqueBouton();
            }


        });
        buttonmap.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                cliqueMap();
            }


        });
    }

    public void cliqueBouton(){
        /*Toast.makeText(getApplicationContext(),"Clique",Toast.LENGTH_SHORT).show();*/
        EditText et = (EditText)findViewById(R.id.editText);
        String nom = et.getText().toString();
        Random random = new Random();
        Position pos_h = new Position(44+random.nextDouble()*2,random.nextDouble()+3);
        Pokemon unPokemon = new Pokemon(nom, pos_h  );
        pokedex.add(unPokemon);
        ListView lv = (ListView)findViewById(R.id.listview);
        lv.setAdapter(new ArrayAdapter<Pokemon>(this,android.R.layout.simple_list_item_1, pokedex));
        et.setText("");
    }

    public void cliqueMap(){
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }
}