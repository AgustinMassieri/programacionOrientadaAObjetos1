package domain;

public class CalculadoraDeLosMiercoles extends CalculadoraDeImporte{
	
	public CalculadoraDeLosMiercoles(Cuenta cuentaAsociada) {
		super(cuentaAsociada);
	}
	
	public double calcularConTarjeta() {
		double importeTotal = 0;
		double descuento = 20; //En porcentaje
		double importeSinDescuento = cuentaAsociada.getImporte();

		importeTotal = importeSinDescuento * ((100-descuento)/100);
		
		return importeTotal;
	}
	
	public double calcularConEfectivo() {
		double importeTotal = 0;
		double descuento = 20; //En porcentaje
		double importeSinDescuento = cuentaAsociada.getImporte();

		importeTotal = importeSinDescuento * ((100-descuento)/100);
		
		return importeTotal;
	}
	
}
