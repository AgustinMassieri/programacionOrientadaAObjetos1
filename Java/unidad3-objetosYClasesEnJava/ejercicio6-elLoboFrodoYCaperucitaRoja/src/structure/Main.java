package structure;

import domain.*;

public class Main {

	public static void main(String[] args) {
		Lobo frodo = new Lobo(205);
		Persona persona = new Persona(85);
		
		System.out.println(frodo);
		System.out.println(persona);
		
		frodo.comer(persona);
		System.out.println(frodo);
		
		frodo.correr(10000);
		System.out.println(frodo);
		
		frodo.imprimirEstado();
	}

}
