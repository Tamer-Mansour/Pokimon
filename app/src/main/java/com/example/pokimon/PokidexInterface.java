package com.example.pokimon;


public interface PokidexInterface {
// abstract method to create pokemon in abstract pokedex class
    Pokemon createPokemon(String name, String type, int health);
// abstract method to attack another  pokemon in abstract pokedex class
    void attackPokemon(Pokemon pokemon);
// abstract method to print pokemon information in pokedex class
    String pokemonInfo(Pokemon pokemon);
}
