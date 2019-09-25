package domain;

public class Triangulo extends Forma {
	private double altura;
	private double base;
	
	public Triangulo (double altura, double base){
		this.altura = altura;
		this.base = base;
	}
	
	@Override
	public double calcularArea() {
		double area = 0;
		
		area = (base * altura) / 2;
		
		return area;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	
}
