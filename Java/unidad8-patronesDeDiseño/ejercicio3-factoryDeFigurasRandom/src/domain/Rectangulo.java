package domain;

public class Rectangulo extends Figura{
	private double altura;
	private double ancho;
	
	@Override
	public String toString() {
		return "Rectangulo [altura=" + altura + ", ancho=" + ancho + "]";
	}

	Rectangulo(double altura, double ancho){
		this.altura = altura;
		this.ancho = ancho;
	}
	
}