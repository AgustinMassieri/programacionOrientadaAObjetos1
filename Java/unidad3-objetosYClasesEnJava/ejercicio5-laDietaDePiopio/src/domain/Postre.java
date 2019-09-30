package domain;

public class Postre extends Alimento{
	
	@Override
	public String toString() {
		return "Postre";
	}

	public double darNumeroDeAporteEnergetico() {return 0;}
}