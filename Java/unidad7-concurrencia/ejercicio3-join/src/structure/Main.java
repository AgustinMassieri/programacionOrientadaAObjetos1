package structure;

public class Main {

	public static void main(String[] args) {
		
		Thread threadMensajeUno = new Thread(new RunnableMensaje(), "Thread 1");
		Thread threadMensajeDos = new Thread(new RunnableMensaje(), "Thread 2");
		
		threadMensajeUno.start();
		threadMensajeDos.start();
		
		try {
			threadMensajeUno.join();
			threadMensajeDos.join();
		}
		catch(InterruptedException excepcion) {
			System.out.println(excepcion);
		}
		
		System.out.println("Fin del main");		
	}

}