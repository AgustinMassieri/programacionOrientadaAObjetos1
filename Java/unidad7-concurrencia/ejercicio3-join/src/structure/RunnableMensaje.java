package structure;

public class RunnableMensaje implements Runnable{

	public void run() {
		
		for(int contador = 0; contador < 5; contador++) {
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException excepcion) {
				System.out.println(excepcion);
			}
			
		}
		
	}
	
}