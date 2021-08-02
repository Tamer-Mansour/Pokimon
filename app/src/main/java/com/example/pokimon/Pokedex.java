package com.example.pokimon;

public class Pokedex extends AbstractPokidex {

    public void pokemonInfo(Pokemon pokemon) {
        System.out.println("Name: "+pokemon.getName()+" Health: "+pokemon.getHealth()+" Type: "+pokemon.getType());
    }
}
