package comparators;

import java.util.Comparator;
import domain.Alumno;

public class comparadorDeApellido implements Comparator<Alumno> {

	public int compare(Alumno alumnoUno, Alumno alumnoDos){
		int resultadoDeComparacion;
		
		resultadoDeComparacion = (alumnoUno.getApellido()).compareTo(alumnoDos.getApellido());
		
		return resultadoDeComparacion;
	}

}
