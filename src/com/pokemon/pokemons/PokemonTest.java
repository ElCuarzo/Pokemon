package com.pokemon.pokemons;

public class PokemonTest {
	public static void main(String[] args) {
		Pokedex pokedex = new Pokedex();
		
		Pokemon pikachu = pokedex.createPokemon("Pikachu", 100, "Electrico");
		pokedex.addPokemon(pikachu);
		
		Pokemon charmander = pokedex.createPokemon("Charmander", 90, "Fuego");
		pokedex.addPokemon(charmander);
		
		Pokemon squirtle = pokedex.createPokemon("Squirtle", 120, "Agua");
		pokedex.addPokemon(squirtle);
		
		pikachu.attackPokemon(charmander, "Charmander");
		System.out.println("La vida de charmander ahora es de: " + charmander.getHealth());
		
		pokedex.listPokemon();
		
		System.out.println("El numero de pokemons creados es de: " + pokedex.getPokemonCount()); 
	}
}
