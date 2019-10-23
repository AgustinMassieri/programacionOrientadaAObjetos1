package domain;

public class Alimento {
	private String nombre;
	private int dias;
	
	public Alimento(String nombre, int dias) {
		this.dias = dias;
		this.nombre = nombre;
	}

	public int getDias() {
		return dias;
	}
	
}