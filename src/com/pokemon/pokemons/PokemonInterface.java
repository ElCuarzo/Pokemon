package com.pokemon.pokemons;
import com.pokemon.pokemons.Pokemon;

public interface PokemonInterface {
	Pokemon createPokemon(String nombre, int vida, String tipo);
	String pokemonInfo(Pokemon pokemon);
	void listPokemon();
}
