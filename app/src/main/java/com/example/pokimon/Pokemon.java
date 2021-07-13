package com.example.pokimon;

public class Pokemon {
    private String name;
    private int helth;
    private String type;
    private static int count;

    public Pokemon(String name, int helth, String type) {
        this.name = name;
        this.helth = helth;
        this.type = type;
    }

    public void attackPokemon(Pokemon pokemon) {
        this.helth -= 10;
    }

    public String getName() {
        return name;
    }

    public int getHelth() {
        return helth;
    }

    public String getType() {
        return type;
    }

    public static int getCount() {
        return count;
    }
}
