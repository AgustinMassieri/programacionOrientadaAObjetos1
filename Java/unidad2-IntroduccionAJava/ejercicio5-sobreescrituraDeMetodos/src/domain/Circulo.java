package domain;

public class Circulo extends Forma {
	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
		double area = 0;
		
		area = Math.PI * Math.pow(radio,2);
		
		return area;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
}
