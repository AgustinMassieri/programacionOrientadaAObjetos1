package structure;

import domain.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		String [] marcas = {"Coca Cola","Pepsi", "Manaos"};
		Bebida bebidaDePrueba = new Bebida(marcas[2]);
		
		List<Bebida> listaDeBebidas = new ArrayList<>();
		
		for( String marca: marcas )
			listaDeBebidas.add(new Bebida(marca));

		for(Iterator<Bebida> iteradorDeLaLista = listaDeBebidas.iterator(); iteradorDeLaLista.hasNext(); ){
			Bebida bebida = iteradorDeLaLista.next();
			System.out.println("- " + bebida);
		}
		
		
		System.out.println("Me tomo una de las bebidas...");
		listaDeBebidas.remove(bebidaDePrueba);
		
		
		for(Iterator<Bebida> iteradorDeLaLista = listaDeBebidas.iterator(); iteradorDeLaLista.hasNext(); ){
			Bebida bebida = iteradorDeLaLista.next();
			System.out.println("- " + bebida);
		}
		
	}

}
