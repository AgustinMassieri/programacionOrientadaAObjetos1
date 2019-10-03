package structure;

import domain.*;

public class Main {

	public static void main(String[] args){
		Lugar cueva = new Lugar("Cueva", 0);
		Lugar bosque = new Lugar("Bosque", 10);
		Lugar casa = new Lugar("Casa De La Abuelita", 15);
		
		Fruta manzanaDePrueba = new Manzana();
		Canasta canastita = new Canasta();
		canastita.agregarFruta(manzanaDePrueba);
		canastita.agregarFruta(manzanaDePrueba);
		canastita.agregarFruta(manzanaDePrueba);
		canastita.agregarFruta(manzanaDePrueba);

		Lobo frodo = new Lobo(220, cueva);
		Persona caperucita = new Persona(75, canastita);
		Persona abuelita = new Persona();
		
		System.out.println(frodo);
		
		System.out.println("Frodo sale de la cueva hacia el bosque...");
		frodo.correrA(bosque);
		System.out.println(frodo);
		
		System.out.println("...Se encuentra a caperucita y ella le tira una manzana...");
		caperucita.atacarAlLobo(frodo);
		System.out.println(frodo);
		
		System.out.println("...Frodo, despues, se va a la casa de la abuelita...");
		frodo.correrA(casa);
		System.out.println(frodo);
		
		System.out.println("Y SE COME A LA ABUELA");
		frodo.comePersona(abuelita);
		System.out.println(frodo);

		System.out.println("...Llega caperucita...");
		System.out.println("Y SE LA COME!!!");
		frodo.comePersona(caperucita);
		System.out.println(frodo);
	}

}
