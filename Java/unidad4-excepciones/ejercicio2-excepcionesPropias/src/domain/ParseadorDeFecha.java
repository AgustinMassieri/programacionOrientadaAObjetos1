package domain;

import exceptions.*;

public class ParseadorDeFecha{
	
	public static void parsearFecha(String fecha) throws FormatoInvalidoDeFecha{
		String [] partesDeLaFecha = fecha.split("/");
		int dia;
		int mes;
		int año;

		try{
			dia = Integer.parseInt(partesDeLaFecha[0]);
			mes = Integer.parseInt(partesDeLaFecha[1]);
			año = Integer.parseInt(partesDeLaFecha[2]);
		}
		catch(Exception cualquierExcepcion) {
			throw new FormatoInvalidoDeFecha();
		}
		
		if(!(esDiaValido(dia) && esMesValido(mes) && esAñoValido(año)) )
			throw new FormatoInvalidoDeFecha();
		
	}
	

	private static boolean esDiaValido(int dia) {
		boolean esValido = false;
		
		if(dia > 0 && dia <= 31)
			esValido = true;
		
		return esValido;
	}
	
	private static boolean esAñoValido(int año) {
		boolean esValido = false;
		
		if(año >= 0)
			esValido = true;
		
		return esValido;
	}
	
	private static boolean esMesValido(int mes) {
		boolean esValido = false;
		
		if(mes > 0 && mes <= 12)
			esValido = true;
		
		return esValido;
	}
	
}