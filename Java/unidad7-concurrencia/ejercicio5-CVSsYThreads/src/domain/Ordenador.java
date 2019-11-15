package domain;

import java.util.Comparator;
import java.util.List;

public class Ordenador {
	
	public Ordenador(List<Alumno> listaDeAlumnos, Comparator<Alumno> criterioDeComparacion) {
		
		listaDeAlumnos.sort(criterioDeComparacion);
		
	}
	
	
	
}
