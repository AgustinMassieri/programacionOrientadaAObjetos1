package domain;

public class TrianguloRandomFactory extends FigurasRandomFactory {

	public Triangulo crearFiguraRandom() {
		double baseAleatoria = generadorDeNumerosAleatorios.nextDouble();
		double alturaAleatorio = generadorDeNumerosAleatorios.nextDouble();

		return new Triangulo(alturaAleatorio,baseAleatoria);
	}

}