package com.pokemon.pokemons;

public class Pokemon {
	private String name;
	private int health;
	private String type;
	private static int count = 0;
	
	public Pokemon(String nombre, int vida, String tipo) {
		this.name = nombre;
		this.health = vida;
		this.type = tipo;
		count++;
	}
	
	public void attackPokemon(Pokemon pokemon, String NombreDelPokemonAtacado) {
		pokemon.health -= 10;
		System.out.println("El Pokemon " + NombreDelPokemonAtacado + " Ha recibido 10 puntos de daño!");
	}
	 
	public void setName(String nombre) {
		this.name = nombre;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setHealth(int vida) {
		this.health = vida;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void setType(String Tipo) {
		this.type = Tipo;
	}
	
	public String getType() {
		return this.type;
	}
	
	public static int getCount() {
		return count;
	}
}
