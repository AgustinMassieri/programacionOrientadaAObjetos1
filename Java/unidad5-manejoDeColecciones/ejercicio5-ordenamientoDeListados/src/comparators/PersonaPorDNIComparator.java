package comparators;

import java.util.Comparator;
import domain.*;

public class PersonaPorDNIComparator implements Comparator<Persona> {

	public int compare(Persona personaUno, Persona personaDos) {
		int comparacion = 0;
		
		Integer numeroDeDNIDePersonaUno = Integer.valueOf(personaUno.getDni());
		Integer numeroDeDNIDePersonaDos = Integer.valueOf(personaDos.getDni());

		comparacion = -numeroDeDNIDePersonaUno.compareTo(numeroDeDNIDePersonaDos);
		
		return comparacion;
	}
	
}
