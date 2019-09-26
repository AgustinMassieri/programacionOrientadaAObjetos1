package structure;

import domain.*;

public class Main {
	public static void main(String [] args) {
		
		Ave piopio = new Ave("Piopio");
		Ave tweety = new Ave("Tweety");
		
		
		System.out.println(piopio.equals(tweety));
		System.out.println(piopio.hashCode());
		
		System.out.println(piopio);
		System.out.println(piopio.getEnergia());
		System.out.println(piopio.volar(50));
		piopio.comer(200);
		System.out.println(piopio.getEnergia());
		System.out.println(piopio.volar(50));
		
		
		
	}
}
