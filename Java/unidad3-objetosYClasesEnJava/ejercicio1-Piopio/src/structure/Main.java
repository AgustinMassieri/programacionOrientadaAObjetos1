package structure;

import domain.*;

public class Main {
	public static void main(String [] args) {
		
		Ave piopio = new Ave("Piopio");
		
		System.out.println(piopio.getEnergia());
		System.out.println(piopio.volar(50));
		piopio.comer(200);
		System.out.println(piopio.getEnergia());
		System.out.println(piopio.volar(50));
		
	}
}
