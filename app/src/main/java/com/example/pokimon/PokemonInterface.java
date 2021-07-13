package com.example.pokimon;

public interface PokemonInterface {

    static Pokemon createPokemon(String name, int health, String type) {
        return createPokemon("", 100, "");
    }

    Pokemon pokemonInfo(Pokemon pokemon);

   void listPokemon();
}
