package domain;

public class Efectivo extends FormaDePago{
	
	public double elegirModoDeCalculo(CalculadoraDeImporte calculadora){
		double importeCalculado;
		
		importeCalculado = calculadora.calcularConEfectivo();
		
		return importeCalculado;
	}
	
}
