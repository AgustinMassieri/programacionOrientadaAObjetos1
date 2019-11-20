package structure;

import domain.*;

public class Main {

	public static void main(String[] args) {
		
		Caballo arregloDeCaballos[] = {
				new Caballo("Centella", 11, 14),
				new Caballo("Tornado", 6, 24),
				new Caballo("Suspiro", 12, 13),
				new Caballo("Relámpago", 10, 21),
				new Caballo("Pegaso", 7, 22),
		};
		
		Carrera carreraUno = new Carrera(5);
		
		for(Caballo caballoDeLaLista: arregloDeCaballos) {
			carreraUno.agregarCaballoALaCarrera(caballoDeLaLista);
		}
		
		carreraUno.iniciarCarrera();
		carreraUno.reportarResultados();
		
	}

}