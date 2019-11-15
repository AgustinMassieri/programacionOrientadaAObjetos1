package domain;

public class Triangulo extends Figura {
	double base;
	double altura;

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + "]";
	}

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
}
