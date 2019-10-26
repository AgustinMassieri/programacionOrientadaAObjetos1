package comparators;

import java.util.Comparator;

import domain.Persona;

public class PersonaPorEdadComparator implements Comparator<Persona>{

	public int compare(Persona personaUno, Persona personaDos) {
		int comparacion = 0;
		
		Integer edadDeLaPersonaUno = Integer.valueOf(personaUno.getEdad());
		Integer edadDeLaPersonaDos = Integer.valueOf(personaDos.getEdad());

		comparacion = edadDeLaPersonaUno.compareTo(edadDeLaPersonaDos);
		
		return comparacion;
	}
	
}
