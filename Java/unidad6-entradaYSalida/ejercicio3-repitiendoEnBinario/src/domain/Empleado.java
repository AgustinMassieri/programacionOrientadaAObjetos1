package domain;

public class Empleado {
	int legajo;
	String nombre;
	String apellido;
	int telefono;
	
	public Empleado(int legajo, String nombre, String apellido, int telefono) {
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;	
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

}