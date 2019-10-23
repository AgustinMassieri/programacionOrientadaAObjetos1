package structure;

import domain.*;
import exceptions.*;

public class Main {

	public static void main(String[] args) {
		
		try {
			Fecha nuevaFecha = new Fecha(1,2,3);
			ManejadorDeFechas.parsearFecha("29/2/2016"); //Probamos con las fechas
			
		}
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}

	}

}
