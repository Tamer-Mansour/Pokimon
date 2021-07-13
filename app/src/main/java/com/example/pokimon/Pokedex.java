package com.example.pokimon;


import java.util.ArrayList;
import java.util.List;

public class Pokedex extends AbstractPokemon {
    List myPokemon;

    @Override
    public List createPokemon(String name, int health, String type) {
        myPokemon = new ArrayList();

        Pokemon p1 = new Pokemon("P1", 120, "Ptype1");
        Pokemon p2 = new Pokemon("P2", 150, "Ptype2");
        myPokemon.add(p1);
        myPokemon.add(new Pokemon("p3", 800, "Ptype3"));

        return myPokemon;
    }

    public void listPokemon() {
         getMyPokemon();
    }


    public List getMyPokemon() {
        return myPokemon;
    }
}
