package structure;

import domain.*;

public class Main {

	public static void main(String[] args) {
		Ave piopio = new Ave("Piopio");
		Pez nemo = new Pez(4);
		Postre postrecito = new Postre();
		Alpiste comidaBasura = new Alpiste(12);
		
		piopio.comer(nemo);
		piopio.comer(postrecito);
		piopio.comer(comidaBasura);
		System.out.println(piopio);
		
		piopio.volar(150);
		
		System.out.println(piopio.tenesHambre());
		
	}

}
