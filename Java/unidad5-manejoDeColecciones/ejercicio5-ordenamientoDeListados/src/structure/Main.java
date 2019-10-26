package structure;

import java.util.ArrayList;
import java.util.List;
import comparators.*;
import domain.*;

public class Main {

	public static void main(String[] args) {
		List<Persona> listaDePersonas = new ArrayList<>();
		
		Persona [] arregloDePersonas = {
				new Persona("Lucas", "Saavedra", 20, 41834306), 
				new Persona("Gerardo", "Van De Graven", 45, 39800306), 
				new Persona("Ignacio", "Kraken", 23, 40000306),
				new Persona("Carla", "Daetler", 19, 30834306),
				new Persona("Lucas", "Veuen", 60, 21834306)
		};
		
		for(Persona p: arregloDePersonas)
			listaDePersonas.add(p);
		
		for(Persona p: listaDePersonas)
			System.out.println("-" + p);
		
		System.out.println("Realizamos el orden...");
		listaDePersonas.sort(new PersonaPorEdadComparator());
		
		for(Persona p: listaDePersonas)
			System.out.println("-" + p);
		
		
	}

}
