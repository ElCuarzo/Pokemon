package com.pokemon.pokemons;

public abstract class AbstractPokemon implements PokemonInterface {
	public Pokemon createPokemon(String nombre, int vida, String tipo) {
		return new Pokemon(nombre, vida, tipo);
	}
	public String pokemonInfo(Pokemon pokemon) {
		return "Nombre " + pokemon.getName() + ", su vida es de: " + pokemon.getHealth() + ", y su tipo es de: " + pokemon.getType();
	}
}
