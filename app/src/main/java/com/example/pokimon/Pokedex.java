package com.example.pokimon;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
    ArrayList<Pokedex> pokemons = new ArrayList<>();

    @Override
    public void listPokemon() {

    }

    public Pokedex(ArrayList<Pokedex> pokemons) {
        this.pokemons = pokemons;
    }
}
