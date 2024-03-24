package com.pokemon.pokemons;
import java.util.ArrayList;
import java.util.List;

public class Pokedex extends AbstractPokemon{
	private List<Pokemon> myPokemons;
	
	public Pokedex() {
		myPokemons = new ArrayList<>();
	}
	
	public void listPokemon() {
		System.out.println("Los Pokemons registrados en la pokedex son:");
		for(Pokemon pokemon: myPokemons) {
			System.out.println(pokemon.getName());
		}
	}
	
	public void addPokemon(Pokemon pokemon) {
		myPokemons.add(pokemon);
	}
	
	public int getPokemonCount() {
		return myPokemons.size();
	}
}
