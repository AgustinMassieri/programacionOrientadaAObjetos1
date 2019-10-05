package structure;

import domain.*;

public class Main {
	public static void main(String[] args) {
		//Creamos los lugares
		Casa casaDeMadera = new Casa(20, new Madera(), 20);
		Casa casaDePaja = new Casa(30, new Paja(), 50);
		Casa casaDeLadrillo = new Casa(10, new Ladrillo(), 10);
		Lugar cuevaDelLobo = new Lugar("Cueva", 0);

		//Creamos a los personajes
		Lobo frodo = new Lobo(350, cuevaDelLobo);
		Chancho chanchitoUno = new Chancho(25, casaDePaja);
		Chancho chanchitoDos = new Chancho(13, casaDeMadera);
		Chancho chanchitoTres = new Chancho(20, casaDeLadrillo);
		
		//Los ponemos en escena
		chanchitoUno.ingresarCasa(casaDePaja);
		chanchitoDos.ingresarCasa(casaDeMadera);
		chanchitoTres.ingresarCasa(casaDeLadrillo);
		
		//Hacemos las pruebas...
		System.out.println(frodo);
		System.out.println(chanchitoUno);
		System.out.println(chanchitoDos);
		System.out.println(chanchitoTres);
		
		//Arrancamos la historia
		System.out.println("El lobo furioso corre a la casa de Paja...");
		frodo.correrA(casaDePaja);
		System.out.println(frodo);
		
		System.out.println("Tira abajo la casa...");
		frodo.soplarCasa(casaDePaja);
		System.out.println(frodo);

		System.out.println("El chanchito asustado sale de la casa derribada y se va con el chachito dos");
		chanchitoUno.salirDeCasa(casaDePaja);
		chanchitoUno.correrA(casaDeMadera);
		chanchitoUno.ingresarCasa(casaDeMadera);
		System.out.println(casaDeMadera.getPeso());
		
		System.out.println("Se encuentra con chanchito dos en su casa de madera... pero el lobo va y la derriba");
		frodo.correrA(casaDeMadera);
		frodo.soplarCasa(casaDeMadera);

		
		System.out.println("Los chanchitos asustados se van a la ultima casa...");
		chanchitoUno.salirDeCasa(casaDeMadera);
		chanchitoDos.salirDeCasa(casaDeMadera);
		chanchitoUno.correrA(casaDeLadrillo);
		chanchitoDos.correrA(casaDeLadrillo);
		chanchitoUno.ingresarCasa(casaDeLadrillo);
		chanchitoDos.ingresarCasa(casaDeLadrillo);
		
		System.out.println("Llega el hombre lobo y derriba la ultima casa...");
		frodo.correrA(casaDeLadrillo);
		frodo.soplarCasa(casaDeLadrillo);

		System.out.println(frodo);
	}

}
