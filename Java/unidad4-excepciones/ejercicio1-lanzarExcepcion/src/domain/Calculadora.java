package domain;

import exceptions.*;

public class Calculadora {

	static public double dividir (double dividendo, double divisor) throws dividirConCero{
		double resultado;
		
		if(divisor != 0)
			resultado = dividendo / divisor;
		else
			throw new dividirConCero();
		
		return resultado;
	}
	
	
	
}
