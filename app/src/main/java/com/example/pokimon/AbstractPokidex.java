package com.example.pokimon;

public abstract class AbstractPokidex implements PokidexInterface {
//create pokemon
    public Pokemon createPokemon(String name, String type, int health) {
        return new Pokemon(name, type, health);
    }
//pokemon attack another pokemon
    public void attackPokemon(Pokemon pokemon) {
        pokemon.setHealth(-10);
    }
}
