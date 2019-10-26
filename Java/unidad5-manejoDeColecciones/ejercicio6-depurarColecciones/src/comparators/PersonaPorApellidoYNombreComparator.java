package comparators;

import java.util.Comparator;
import domain.*;

public class PersonaPorApellidoYNombreComparator implements Comparator<Persona>{

	public int compare(Persona personaUno, Persona personaDos) {
		int comparacion = 0;
		
		String nombreDeLaPersonaUno = personaUno.getNombre();
		String nombreDeLaPersonaDos = personaDos.getNombre();

		String apellidoDeLaPersonaUno = personaUno.getApellido();
		String apellidoDeLaPersonaDos = personaDos.getApellido();

		comparacion = apellidoDeLaPersonaUno.compareTo(apellidoDeLaPersonaDos);
		
		if(comparacion == 0)
			comparacion = nombreDeLaPersonaUno.compareTo(nombreDeLaPersonaDos);
		
		return comparacion;
	}
	
	
}
