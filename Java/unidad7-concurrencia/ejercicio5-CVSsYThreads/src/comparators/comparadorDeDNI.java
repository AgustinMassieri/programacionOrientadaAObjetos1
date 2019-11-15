package comparators;

import java.util.Comparator;
import domain.Alumno;

public class comparadorDeDNI implements Comparator<Alumno> {

	public int compare(Alumno alumnoUno, Alumno alumnoDos){
		int resultadoDeComparacion;
		
		if(alumnoUno.getDNI() > alumnoDos.getDNI())
			resultadoDeComparacion = 1;
		else if(alumnoUno.getDNI() < alumnoDos.getDNI())
			resultadoDeComparacion = -1;
		else
			resultadoDeComparacion = 0;
		
		return resultadoDeComparacion;
	}
	
}
