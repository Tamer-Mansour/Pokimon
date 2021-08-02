package com.example.pokimon;


public interface PokidexInterface {

    Pokemon createPokemon(String name, String type, int health);
    void attackPokemon(Pokemon pokemon);
    String pokemonInfo(Pokemon pokemon);
}
