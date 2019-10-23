package structure;

import domain.*;

public class Main {

	public static void main(String[] args) {
		try {
			Circulo circuloDePrueba = new Circulo(0);
			System.out.println(circuloDePrueba.calcularArea());
		}
		catch(Exception error) {
			System.out.println(error.getMessage());
		}
		
	}

}
