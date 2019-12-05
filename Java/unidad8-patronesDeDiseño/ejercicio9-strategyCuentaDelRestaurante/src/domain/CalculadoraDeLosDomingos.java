package domain;

public class CalculadoraDeLosDomingos extends CalculadoraDeImporte{
	
	public CalculadoraDeLosDomingos(Cuenta cuentaAsociada) {
		super(cuentaAsociada);
	}
	
	public double calcularConTarjeta() {
		double importeTotal = 0;
		
		importeTotal = cuentaAsociada.getImporte();
		
		return importeTotal;
	}
	
	public double calcularConEfectivo() {
		double importeTotal = 0;
		double descuento = 10; //En porcentaje
		double importeSinDescuento = cuentaAsociada.getImporte();

		importeTotal = importeSinDescuento * ((100-descuento)/100);
		
		return importeTotal;
	}
	
}