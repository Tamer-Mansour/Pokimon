package com.example.pokimon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class PokemonTest extends AppCompatActivity {
EditText TheText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TheText = findViewById(R.id.TheText);
        Pokedex pokedex = new Pokedex();
        Pokemon p1 = pokedex.createPokemon("p1", "fire", 100);
        Pokemon p2 = pokedex.createPokemon("p2", "water", 70);

        pokedex.attackPokemon(p1);
        pokedex.pokemonInfo(p1);
        pokedex.pokemonInfo(p2);

        TheText.setText(""+p1.getHealth());
    }
}