package domain;

public class Tarjeta extends FormaDePago{
	
	public double elegirModoDeCalculo(CalculadoraDeImporte calculadora){
		double importeCalculado;
		
		importeCalculado = calculadora.calcularConTarjeta();
		
		return importeCalculado;
	}
	
}
