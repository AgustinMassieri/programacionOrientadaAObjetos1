package structure;

import domain.*;

public class Main {

	public static void main(String[] args) {
		
		Cafe cafeBase = new Cafe();

		//Nos armamos un Cappuccino
		Agregado cafeConLeche = new Leche(cafeBase);
		Agregado Cappuccino = new Chocolate(new Crema(cafeConLeche));
		
		System.out.println(Cappuccino.darPrecio());
	}

}
