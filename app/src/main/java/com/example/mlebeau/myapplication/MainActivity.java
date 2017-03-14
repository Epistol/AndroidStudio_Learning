package com.example.mlebeau.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Pokemon> pokedex = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                cliqueBouton();
            }


        });

    }

    public void cliqueBouton(){
        /*Toast.makeText(getApplicationContext(),"Clique",Toast.LENGTH_SHORT).show();*/
        EditText et = (EditText)findViewById(R.id.editText);
        String txt = et.getText().toString();
        pokedex.add(txt);
        ListView lv = (ListView)findViewById(R.id.listview);
        lv.setAdapter(new ArrayAdapter<Pokemon>(this,android.R.layout.simple_list_item_1, pokedex));
        et.setText("");
    }
}