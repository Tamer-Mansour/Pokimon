package com.example.pokimon;

public class Pokedex extends AbstractPokidex {

    public String pokemonInfo(Pokemon pokemon) {
        return String.format("Name: "+pokemon.getName()+" Health: "+
                pokemon.getHealth()+" Type: "+pokemon.getType());
    }
}
