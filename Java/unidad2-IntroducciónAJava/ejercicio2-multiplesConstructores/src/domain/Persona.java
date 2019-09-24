package domain;

import java.time.*;
//Usamos la clase LocalDate que representa una fecha

public class Persona {
	private String nombre;
	private int edad;

	private static int calcularEdad(int añoDeNacimiento, int mesDeNacimiento, int diaDeNacimiento){  
	        LocalDate fechaDeNacimiento = LocalDate.of(añoDeNacimiento, mesDeNacimiento, diaDeNacimiento);
	        LocalDate fechaActual = LocalDate.now();
	        Period diferenciaEntreFechas = Period.between(fechaDeNacimiento, fechaActual);
	        int edad = diferenciaEntreFechas.getYears();

	        return edad;
	}	
	
	public Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona(String nombre, String fechaDeNacimiento) {
		String [] informacionDeLaFecha = fechaDeNacimiento.split("/");
		int añoDeNacimiento = Integer.parseInt(informacionDeLaFecha[2]);
		int mesDeNacimiento = Integer.parseInt(informacionDeLaFecha[1]);
		int diaDeNacimiento = Integer.parseInt(informacionDeLaFecha[0]);
		
		this.setNombre(nombre);
		this.setEdad(calcularEdad(añoDeNacimiento, mesDeNacimiento, diaDeNacimiento));
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
