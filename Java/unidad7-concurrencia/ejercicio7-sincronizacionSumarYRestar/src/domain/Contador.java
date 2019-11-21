package domain;

public class Contador {
	static int contador = 0;
	
	public synchronized void incrementar() {
		contador++;
	}
	
	public synchronized void decrementar() {
		contador--;
	}
	
	public synchronized int dameEstadoActual() {
		return contador;
	}
	
}