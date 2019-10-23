package domain;

import java.util.Calendar;

public class ManejadorDeFechas {
	
	public static String fomatearFecha(Fecha unaFecha) {
		String fechaEnFormatoString = null;
		String diaEnString = null;
		String mesEnString = null;
		String añoEnString = null;

		if(unaFecha.dia < 10)
			diaEnString = "0" + Integer.toString(unaFecha.dia);
		else
			diaEnString = Integer.toString(unaFecha.dia);
		
		if(unaFecha.mes < 10)
			mesEnString = "0" + Integer.toString(unaFecha.mes);
		else
			mesEnString = Integer.toString(unaFecha.mes);
		
		if(unaFecha.año < 10)
			añoEnString = "000" + Integer.toString(unaFecha.año);
		else if(unaFecha.año < 100)
			añoEnString = "00" + Integer.toString(unaFecha.año);
		else if(unaFecha.año < 1000)
			añoEnString = "0" + Integer.toString(unaFecha.año);
		else
			añoEnString = Integer.toString(unaFecha.año);
		
		fechaEnFormatoString = diaEnString+"/"+mesEnString+"/"+añoEnString;
		
		return fechaEnFormatoString;
	}
	
	public static Fecha parsearFecha(String unaFecha) throws Exception{
		Fecha fechaDelString = null;
		String [] partesDeLaFecha = unaFecha.split("/");
		int dia = Integer.parseInt(partesDeLaFecha[0]);
		int mes = Integer.parseInt(partesDeLaFecha[1]);
		int año = Integer.parseInt(partesDeLaFecha[2]);
		
		fechaDelString = new Fecha(dia, mes, año);
		
		return fechaDelString;
	}
	
	public static int cantidadDeAnios(Fecha unaFecha) {
		int añoActual = Calendar.getInstance().get(Calendar.YEAR);
		int cantidadDeAnios = añoActual - unaFecha.año;
		
		return cantidadDeAnios;
	}
	
	
	
	
	
	
	
	
	
}
