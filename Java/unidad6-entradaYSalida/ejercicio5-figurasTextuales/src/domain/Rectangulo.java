package domain;

public class Rectangulo extends Figura {
	double base;
	double altura;
	
	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
}
