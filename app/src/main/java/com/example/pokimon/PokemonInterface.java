package com.example.pokimon;

import java.util.List;

public interface PokemonInterface {

    List createPokemon(String name, int health, String type);

    Pokemon pokemonInfo(Pokemon pokemon);

    void listPokemon();
}
