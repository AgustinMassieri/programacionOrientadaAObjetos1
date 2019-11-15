package structure;

public class Main {

	public static void main(String[] args) {
		
		Thread threadConHerencia = new HolaMundoThread();
		Thread threadConImplementacion = new Thread(new HolaMundoRunnable());
		
		threadConHerencia.start();
		threadConImplementacion.start();
		System.out.println("Fin de Main");
	}

}
