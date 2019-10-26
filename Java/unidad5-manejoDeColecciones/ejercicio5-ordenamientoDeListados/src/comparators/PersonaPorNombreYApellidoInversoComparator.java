package comparators;

import domain.Persona;
import java.util.Comparator;

public class PersonaPorNombreYApellidoInversoComparator implements Comparator<Persona>{

	public int compare(Persona personaUno, Persona personaDos) {
		int comparacion = 0;
		
		String nombreDeLaPersonaUno = personaUno.getNombre();
		String nombreDeLaPersonaDos = personaDos.getNombre();

		String apellidoDeLaPersonaUno = personaUno.getApellido();
		String apellidoDeLaPersonaDos = personaDos.getApellido();

		comparacion = nombreDeLaPersonaDos.compareTo(nombreDeLaPersonaUno);
		
		if(comparacion == 0)
			comparacion = apellidoDeLaPersonaDos.compareTo(apellidoDeLaPersonaUno);
		
		return comparacion;
	}
	
}
