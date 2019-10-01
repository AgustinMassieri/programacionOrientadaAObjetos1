package domain;

public class Insatisfecho extends Satisfaccion {

	@Override
	public String toString() {
		return "Insatisfecho";
	}
	
	public boolean estaActivo(){
		return false;
	}
	
	public boolean noEstaActivo(){
		return true;
	}
	
}