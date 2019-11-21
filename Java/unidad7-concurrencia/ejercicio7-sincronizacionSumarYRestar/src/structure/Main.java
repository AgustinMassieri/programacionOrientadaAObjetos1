package structure;

import domain.Contador;

public class Main {

	public static void main(String[] args) {
		
		Contador contador = new Contador();
		
		Thread arregloDeHilosDeEjecucion [] = {
				new Thread (new RunnableIncrementarMilVeces(contador)),
				new Thread (new RunnableIncrementarMilVeces(contador)),
				new Thread (new RunnableIncrementarMilVeces(contador)),
				new Thread (new RunnableDecrementarMilVeces(contador)),
				new Thread (new RunnableDecrementarMilVeces(contador)),
				new Thread (new RunnableDecrementarMilVeces(contador))
		};
		
		for(Thread hiloDeEjecucion: arregloDeHilosDeEjecucion)
			hiloDeEjecucion.start();
		
		try{
			for(Thread hiloDeEjecucion: arregloDeHilosDeEjecucion)
				hiloDeEjecucion.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println(contador.dameEstadoActual());
		}
		
		
	}
	
}