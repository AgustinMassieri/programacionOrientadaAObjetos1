package domain;

public class Persona {
	double peso;
	
	@Override
	public String toString() {
		return "Persona [peso=" + peso + "]";
	}

	public Persona(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}
	
}