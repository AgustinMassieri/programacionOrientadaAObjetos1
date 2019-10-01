package domain;


public class Indigesto extends Digestion {
	
	@Override
	public String toString() {
		return "Indigesto";
	}
	
	public boolean estaActivo(){
		return false;
	}
	
	public boolean noEstaActivo(){
		return true;
	}

}