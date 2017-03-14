package com.example.mlebeau.myapplication;

/**
 * Created by mlebeau on 14/03/2017.
 */

public class Pokemon {
    private int id;
    private String nom;
    private Position position;

    public Pokemon(int id, String nom, Position position) {
        this.id = id;
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
