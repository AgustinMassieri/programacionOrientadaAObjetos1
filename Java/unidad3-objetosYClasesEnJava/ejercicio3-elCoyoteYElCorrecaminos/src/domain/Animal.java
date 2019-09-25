package domain;

public abstract class Animal {
	private int peso;
	private int energia;
	
	public Animal(int peso, int energia) {
		
	}
	
	public abstract int obtenerVelocidad();
	public abstract boolean correrAlAnimal();
}
