package structure;

public class HolaMundoThread extends Thread{
	
	@Override
	public void run() {
		yield();
		System.out.println("Hola Mundo Thread");
	}
	
}
