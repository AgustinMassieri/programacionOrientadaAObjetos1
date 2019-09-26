package domain;

public class Correcaminos extends Animal {
	
	public Correcaminos(int peso, int posicion, int energia) {
		super(peso, posicion, energia);
	}
	
	@Override
	public String toString() {
		return "Correcaminos [peso=" + peso + ", energia=" + energia + ", posicion=" + posicion + " velocidad="+ this.obtenerVelocidad() +"]";
	}

	public double obtenerVelocidad() {
		double velocidad;
		
		velocidad = 10 - peso;
		
		return Math.abs(velocidad);
	}
	
}
