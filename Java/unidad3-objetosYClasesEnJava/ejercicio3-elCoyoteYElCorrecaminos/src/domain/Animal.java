package domain;

public abstract class Animal {
	protected int peso;
	protected int energia;
	protected int posicion;
	
	public abstract double obtenerVelocidad();
	
	public Animal(int peso, int posicion, int energia) {
		this.energia = energia;
		this.posicion = posicion;
		this.peso = peso;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
}