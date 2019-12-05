package domain;

public class CirculoRandomFactory extends FigurasRandomFactory {

	public Circulo crearFiguraRandom() {
		double radioAleatorio = generadorDeNumerosAleatorios.nextDouble();
		return new Circulo(radioAleatorio);
	}

}