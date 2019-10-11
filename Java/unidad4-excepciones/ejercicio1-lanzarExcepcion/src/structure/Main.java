package structure;

import domain.Calculadora;

public class Main {

	public static void main(String[] args) {
		
		try{
			Calculadora.dividir(5,0);
		}
		catch(Exception excepcion){
			System.out.println(excepcion.getMessage());
		}
		
	}

}
