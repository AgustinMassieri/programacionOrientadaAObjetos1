package domain;

public class Persona {
	double peso;
	Canastita canasta;
	
	@Override
	public String toString() {
		return "Persona [peso=" + peso + "]";
	}

	public Persona() {
		this.peso = 0;
	}
	
	public Persona(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}
	
}