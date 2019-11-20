package domain;

import java.util.List;
import java.util.ArrayList;
import structure.RunnableCorrerCarreraCaballo;

public class Carrera {

	double distancia;
	List<Caballo> listaDeCaballos;
	List<Caballo> listaDeCaballosPorOrdenDeLlegada;
	List<Thread> listaDeHilosDeRunningDeCaballos;	
	
	public Carrera(double distancia) {
		this.distancia = distancia;
		listaDeCaballos = new ArrayList<>();
		listaDeCaballosPorOrdenDeLlegada = new ArrayList<>();
		listaDeHilosDeRunningDeCaballos = new ArrayList<>();
	}
	
	public void agregarCaballoALaCarrera(Caballo caballoNuevo) {
		listaDeCaballos.add(caballoNuevo);
		listaDeHilosDeRunningDeCaballos.add(new Thread( new RunnableCorrerCarreraCaballo(this,caballoNuevo, distancia) ) );
	}
	
	public void iniciarCarrera() {
		System.out.println("Carrera en desarollo...");
		
		for(Thread hiloDeRunning: listaDeHilosDeRunningDeCaballos)
			hiloDeRunning.start();
		
		try{	
			for(Thread hiloDeRunning: listaDeHilosDeRunningDeCaballos)
				hiloDeRunning.join();
		}
		catch(Exception e) {
			System.out.println("Error en la carrera!");
		}
		finally {
			System.out.println("Carrera terminada");
		}
		
	}
	
	public void agregarAListaDeLlegada(Caballo caballo) {
		int posicionDeLlegada = listaDeCaballosPorOrdenDeLlegada.size() + 1;
		listaDeCaballosPorOrdenDeLlegada.add(caballo);
		caballo.setPosicionDeLlegada(posicionDeLlegada);
	}
	
	public void reportarResultados() {
		imprimirListadoDeCaballosPorNombreYConPosicionDeLlegada();
		imprimirListadoPorOrdenDeLlegadaALaMeta();
	}
	
	public void imprimirListadoDeCaballosPorNombreYConPosicionDeLlegada() {
		listaDeCaballos.sort(new ComparatorPorNombreDeCaballos());
		
		System.out.println("\nLista por orden alfabetico");
		for(Caballo caballo: listaDeCaballos)
			System.out.println(caballo.getNombre() + "("+caballo.getPosicionDeLlegada()+")");
		
	}
	
	public void imprimirListadoPorOrdenDeLlegadaALaMeta() {
		int contador = 1;
		
		System.out.println("\nLista por orden de llegada");
		
		for(Caballo caballo: listaDeCaballosPorOrdenDeLlegada) {
			System.out.println(contador+"- "+caballo.getNombre());
			contador++;
		}
		
	}
	
}