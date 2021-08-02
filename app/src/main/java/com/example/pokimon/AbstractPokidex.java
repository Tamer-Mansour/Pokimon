package com.example.pokimon;

public abstract class AbstractPokidex implements PokidexInterface {

    public Pokemon createPokemon(String name, String type, int health) {
        return new Pokemon(name, type, health);
    }

    public void attackPokemon(Pokemon pokemon) {
        pokemon.setHealth(-10);
    }
}
