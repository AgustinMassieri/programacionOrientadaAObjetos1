package domain;

public class Caballo{
	String nombre;
	private double velocidadMinima = 0;
	private double velocidadMaxima = 0;
	private int posicionDeLlegada = 0;

	@Override
	public String toString() {
		return "Caballo [nombre=" + nombre + "]";
	}

	public Caballo(String nombre, double velocidadMinima, double velocidadMaxima) throws IllegalArgumentException{
		this.nombre = nombre;
		
		if(velocidadMinima > velocidadMaxima)
			throw new IllegalArgumentException();
		
		this.velocidadMaxima = velocidadMaxima;
		this.velocidadMinima = velocidadMinima;
	}	
	
	public double getVelocidad() {
		double velocidad = 0;
		
		velocidad = Math.random() * (velocidadMaxima - velocidadMinima);
		
		return velocidad;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int getPosicionDeLlegada() {
		return posicionDeLlegada;
	}

	public void setPosicionDeLlegada(int posicionDeLlegada) {
		this.posicionDeLlegada = posicionDeLlegada;
	}
	
}