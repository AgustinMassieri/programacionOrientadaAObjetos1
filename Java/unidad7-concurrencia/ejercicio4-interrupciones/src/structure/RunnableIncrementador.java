package structure;

public class RunnableIncrementador implements Runnable {

	public void run(){
		int contador = 0;
		
		while(true) {
			System.out.println(contador);
			contador++;
			
			if(Thread.interrupted())
				return;
			
		}
		
	}
	
}