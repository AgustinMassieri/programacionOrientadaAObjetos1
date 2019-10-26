package structure;

import domain.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		String [] marcas = {"Coca Cola","Pepsi", "Manaos","Coca Cola", "Fanta"};
		Bebida bebidaDePrueba = new Bebida(marcas[2]);
		
		Set<Bebida> setDeBebidas = new HashSet<>();
		
		for( String marca: marcas )
			setDeBebidas.add(new Bebida(marca));

		for(Iterator<Bebida> iteradorDeLaLista = setDeBebidas.iterator(); iteradorDeLaLista.hasNext(); ){
			Bebida bebida = iteradorDeLaLista.next();
			System.out.println("- " + bebida);
		}
		
	}

}
