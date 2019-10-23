package domain;

import exceptions.*;

public class VerificadorVencimiento {
	
	public static void todaviaSirve(Alimento unAlimento) throws AlimentoEnMalEstadoException{
		
		if(unAlimento.getDias() <= 0)
			throw new AlimentoEnMalEstadoException();
		
	}
	
}
