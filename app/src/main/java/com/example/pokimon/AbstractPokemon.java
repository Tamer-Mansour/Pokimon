package com.example.pokimon;

public abstract class AbstractPokemon implements PokemonInterface {
    public void createPokemon(){

    }
    public String pokemonInfo(Pokemon pokemon){
        return pokemon.getName() + pokemon.getHelth() + pokemon.getType();
    }
}
