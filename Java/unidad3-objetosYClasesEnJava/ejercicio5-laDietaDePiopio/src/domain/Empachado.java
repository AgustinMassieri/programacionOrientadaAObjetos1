package domain;

public class Empachado extends Digestion {
	
	@Override
	public String toString() {
		return "Empachado";
	}
	
	public boolean estaActivo(){
		return true;
	}
	
	public boolean noEstaActivo(){
		return false;
	}
	
}
