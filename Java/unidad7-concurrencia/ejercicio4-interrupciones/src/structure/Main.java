package structure;

public class Main {

	public static void main(String[] args) {
		
		Thread threadIncrementador = new Thread(new RunnableIncrementador());
		threadIncrementador.start();
		
		//Suspendemos al hilo Main y luego interrumpimos
		try {
			Thread.sleep(5000);
			threadIncrementador.interrupt();
		}
		catch(InterruptedException excepcion) {
			System.out.println(excepcion);
		}
		
		System.out.println("Fin de main");

	}

}
