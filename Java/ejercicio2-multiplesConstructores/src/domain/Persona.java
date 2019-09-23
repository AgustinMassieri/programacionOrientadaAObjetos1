package domain;

import java.time.*;
//Usamos la clase LocalDate que representa una fecha

public class Persona {
	private String nombre;
	private int edad;

	private static int darEdad(int añoDeNacimiento, int mesDeNacimiento, int diaDeNacimiento){  
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
		
		this.nombre = nombre;
		this.edad = darEdad(añoDeNacimiento, mesDeNacimiento, diaDeNacimiento);
	}
	
	public String darNombre() {
		return this.nombre;
	}
	
	public int darEdad() {
		return this.edad;
	}
	
}
