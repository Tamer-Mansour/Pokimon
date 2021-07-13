package com.example.pokimon;

public interface PokemonInterface {

    static Pokemon createPokemon(String name, int health, String type) {
        return createPokemon("", 100, "");
    }

    static int pokemonInfo(Pokemon pokemon) {
        return pokemon.getHelth();
    }

    public void listPokemon();
}
