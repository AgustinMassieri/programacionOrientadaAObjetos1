package structure;

import domain.Contador;

public class RunnableIncrementarMilVeces implements Runnable{
	
	Contador contador = null;
	
	public RunnableIncrementarMilVeces(Contador contador) {
		this.contador = contador;
	}
	
	public void run() {
		int numeroDeIncrementaciones = 0;
		
		while(numeroDeIncrementaciones < 1000) {
			contador.incrementar();
			numeroDeIncrementaciones++;
		}

	}
	
	
}
