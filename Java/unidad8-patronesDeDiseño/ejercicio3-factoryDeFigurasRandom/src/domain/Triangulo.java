package domain;

public class Triangulo extends Figura{
	private double altura;
	private double base;

	@Override
	public String toString() {
		return "Triangulo [altura=" + altura + ", base=" + base + "]";
	}

	Triangulo(double altura, double base){
		this.altura = altura;
		this.base = base;
	}
	
}