package domain;

public class Alpiste extends Alimento{
	double gramos;
	
	@Override
	public String toString() {
		return "Alpiste [gramos=" + gramos + "]";
	}

	public Alpiste(double gramos) {
		this.gramos = gramos;
	}
	
	public double darNumeroDeAporteEnergetico() {return 4 * gramos;}	
}
