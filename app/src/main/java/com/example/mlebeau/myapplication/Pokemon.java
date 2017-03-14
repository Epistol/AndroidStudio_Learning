package com.example.mlebeau.myapplication;

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
}
