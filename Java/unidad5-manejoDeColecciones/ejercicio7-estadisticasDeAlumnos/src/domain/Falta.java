package domain;

public class Falta {
	
	private boolean estaJustificada;
	
	public Falta(boolean estaJustificada){
		this.estaJustificada = estaJustificada;
	}
	
	public boolean estaJustificada() {
		return estaJustificada;
	}
	
	public boolean noEstaJustificada() {
		return !estaJustificada;
	}
	
}
