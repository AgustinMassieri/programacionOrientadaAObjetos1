package domain;

public class Archivo implements Unidad {
	private double tamaño;
	
	public Archivo(double tamaño) {
		this.tamaño = tamaño;
	}
	
	public double tamañoTotal() {
		return this.tamaño;
	}
	
}
