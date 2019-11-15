package domain;

public class Circulo extends Figura {
	double radio;

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	public Circulo(double radio) {
		this.radio = radio;
	}
	
}