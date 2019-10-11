package structure;

import domain.*;
import exceptions.FormatoInvalidoDeFecha;

public class Main {

	public static void main(String[] args) {
		String fecha = "31/5/1999";

		try{
			ParseadorDeFecha.parsearFecha(fecha);
		}
		catch(FormatoInvalidoDeFecha excepcion) {
			System.out.println(excepcion.getMessage());
		}
		
	}

}
