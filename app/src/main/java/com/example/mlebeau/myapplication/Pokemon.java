package com.example.mlebeau.myapplication;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by mlebeau on 14/03/2017.
 */

public class Pokemon {

    private String nom;
    private Position position;

    public Pokemon(String nom, Position position) {
        this.nom = nom;
        this.position = position;
    }


    public Position getPosition() {
        return position;
    }

    public String getNom() {
        return nom;
    }



    @Override
    public String toString(){
        NumberFormat df = new DecimalFormat("####0.0000");
        return nom + " " + "(" + df.format(position.getLat()) + "/" +  df.format(position.getLng()) + ")";
    }
}
