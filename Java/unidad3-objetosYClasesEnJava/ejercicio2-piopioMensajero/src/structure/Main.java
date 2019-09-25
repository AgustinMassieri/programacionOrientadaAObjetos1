package structure;

import domain.*;

public class Main {
	public static void main(String [] args) {
		Lugar lugarUno = new Lugar("Buenos Aires", 0);
		Lugar lugarDos = new Lugar("Chascomús", 122);
		Lugar lugarTres = new Lugar("Lezama", 156);
		Lugar lugarCuatro = new Lugar("Dolores", 210);
		Lugar lugarCinco = new Lugar("Las Armas", 300);
		Lugar lugarSeis = new Lugar("Mar Del Plata", 400);


		Ave piopio = new Ave("Piopio", lugarTres);
		piopio.comer(10);
		System.out.println(piopio.getEnergia());
		System.out.println(piopio.volarAUnLugar(lugarCinco));
		System.out.println(piopio.volarAUnLugar(lugarDos));
		System.out.println(piopio.volarAUnLugar(lugarTres));
		System.out.println(piopio.volarAUnLugar(lugarDos));
		System.out.println(piopio.volarAUnLugar(lugarSeis));
		
		System.out.println(piopio.sePuedeVolarAlLugar(lugarSeis));

	}
}
