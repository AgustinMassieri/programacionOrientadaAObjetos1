package domain;

public class Rectangulo extends Forma {
	private double altura;
	private double ancho;
	
	public Rectangulo (double altura, double ancho){
		this.altura = altura;
		this.ancho = ancho;
	}
	
	@Override
	public double calcularArea() {
		double area = 0;
		
		area = altura * ancho;
		
		return area;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	
}
