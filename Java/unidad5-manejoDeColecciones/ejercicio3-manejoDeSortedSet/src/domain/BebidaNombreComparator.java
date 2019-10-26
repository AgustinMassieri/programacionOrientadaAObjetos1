package domain;

import java.util.*;

public class BebidaNombreComparator implements Comparator<Bebida>{
	
	public int compare(Bebida bebidaUno, Bebida bebidaDos) {
		int comparacion;
		
		comparacion = -(bebidaUno.compareTo(bebidaDos)); //Invertimos el signo
		
		return comparacion;
	}
	
}