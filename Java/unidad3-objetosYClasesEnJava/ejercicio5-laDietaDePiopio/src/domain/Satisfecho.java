package domain;

public class Satisfecho extends Satisfaccion {
	
	@Override
	public String toString() {
		return "Satisfecho";
	}
	
	public boolean estaActivo(){
		return true;
	}
	
	public boolean noEstaActivo(){
		return false;
	}
	
}