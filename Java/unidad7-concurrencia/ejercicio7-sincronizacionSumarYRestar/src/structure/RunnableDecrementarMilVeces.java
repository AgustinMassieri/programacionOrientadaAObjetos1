package structure;

import domain.Contador;

public class RunnableDecrementarMilVeces implements Runnable{

	Contador contador = null;
	
	public RunnableDecrementarMilVeces(Contador contador) {
		this.contador = contador;
	}
	
	public void run() {
		int numeroDeDecrementaciones = 0;
		
		while(numeroDeDecrementaciones < 1000) {
			contador.decrementar();
			numeroDeDecrementaciones++;
		}

	}
	
	
}
