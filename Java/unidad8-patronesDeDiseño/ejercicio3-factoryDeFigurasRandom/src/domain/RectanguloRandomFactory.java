package domain;

public class RectanguloRandomFactory extends FigurasRandomFactory {

	public Rectangulo crearFiguraRandom() {
		double anchoAleatorio = generadorDeNumerosAleatorios.nextDouble();
		double alturaAleatorio = generadorDeNumerosAleatorios.nextDouble();

		return new Rectangulo(alturaAleatorio,anchoAleatorio);
	}

}