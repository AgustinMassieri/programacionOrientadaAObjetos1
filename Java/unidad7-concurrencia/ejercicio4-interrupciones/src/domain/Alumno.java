package domain;

public class Alumno{
	private String nombre;
	private String apellido;
	private int DNI;
	
	public Alumno(String nombre, String apellido, int DNI) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.DNI = DNI;
	}	
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getDNI() {
		return DNI;
	}

}