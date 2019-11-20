package domain;

import java.util.Comparator;

public class ComparatorPorNombreDeCaballos implements Comparator<Caballo> {

	public int compare(Caballo caballoUno, Caballo caballoDos) {
		int comparacion;
		String nombreDeCaballoUno = caballoUno.getNombre();
		String nombreDeCaballoDos = caballoDos.getNombre();
		
		comparacion = nombreDeCaballoUno.compareTo(nombreDeCaballoDos);
		
		return comparacion;
	}

}