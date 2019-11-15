package structure;

public class HolaMundoThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("Hola Mundo Thread");
	}
	
}
