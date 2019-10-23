package domain;

public class Circulo {
	double radio = 0;
	
	public Circulo() {
		radio = 1;
	}
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	public void setRadio(double radio) throws IllegalArgumentException{
		
		if(radio <= 0)
			throw new IllegalArgumentException("Error!");
		else
			this.radio = radio;
	
	}
	
	public double calcularArea() throws IllegalStateException{
		double area = 0;
		
		if(radio == 0)
			throw new IllegalStateException("Error!");
		
		area = Math.pow(radio, 2) * Math.PI;
		
		return area;
	}
	
}