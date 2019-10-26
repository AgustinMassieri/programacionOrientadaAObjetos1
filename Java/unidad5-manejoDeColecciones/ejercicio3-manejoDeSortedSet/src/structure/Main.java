package structure;

import domain.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		String [] marcas = {"Coca Cola","Pepsi", "Manaos","Coca Cola", "Fanta"};
		
		Set<Bebida> setDeBebidas = new TreeSet<>(new BebidaNombreComparator());
		
		for( String marca: marcas )
			setDeBebidas.add(new Bebida(marca));

		for(Iterator<Bebida> iteradorDeLaLista = setDeBebidas.iterator(); iteradorDeLaLista.hasNext(); ){
			Bebida bebida = iteradorDeLaLista.next();
			System.out.println("- " + bebida);
		}
		
	}

}
