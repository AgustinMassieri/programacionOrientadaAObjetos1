package domain;

public class Pez extends Alimento{
	int edad;
	
	@Override
	public String toString() {
		return "Pez [edad=" + edad + "]";
	}

	public Pez(int edad) {
		this.edad = edad;
	}
	
	public double darNumeroDeAporteEnergetico() {
		return Math.sqrt(edad);
	}
	
}