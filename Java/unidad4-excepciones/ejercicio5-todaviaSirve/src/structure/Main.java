package structure;

import domain.*;
import exceptions.*;

public class Main {

	public static void main(String[] args) {
		
		try {
			Alimento alimentoDePrueba = new Alimento("Turron", -5);
			VerificadorVencimiento.todaviaSirve(alimentoDePrueba);
		}
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}

	}

}
