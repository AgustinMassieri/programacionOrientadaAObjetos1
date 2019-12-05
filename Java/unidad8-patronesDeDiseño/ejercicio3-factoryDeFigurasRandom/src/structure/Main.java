package structure;

import domain.*;

public class Main {

	public static void main(String[] args) {
		FigurasRandomFactory factoryDeTriangulos = new TrianguloRandomFactory();
		FigurasRandomFactory factoryDeCirculo = new CirculoRandomFactory();
		FigurasRandomFactory factoryDeRectangulo = new RectanguloRandomFactory();

		System.out.println(factoryDeCirculo.crearFiguraRandom());
		System.out.println(factoryDeTriangulos.crearFiguraRandom());
		System.out.println(factoryDeRectangulo.crearFiguraRandom());
	}

}
