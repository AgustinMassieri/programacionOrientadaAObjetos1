package domain;

import java.util.Random;

public abstract class FigurasRandomFactory {

	Random generadorDeNumerosAleatorios = new Random();
	
	public abstract Figura crearFiguraRandom();
	
}