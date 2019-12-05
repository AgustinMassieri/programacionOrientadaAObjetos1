package domain;

public class Circulo extends Figura{
	private double radio;
	
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	Circulo(double radio){
		this.radio = radio;
	}
	
}