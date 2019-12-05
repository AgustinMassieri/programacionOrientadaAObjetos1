package domain;

public class CalculadoraStandard extends CalculadoraDeImporte{
	
	public CalculadoraStandard(Cuenta cuentaAsociada) {
		super(cuentaAsociada);
	}
		
	public double calcularConTarjeta() {
		double importeTotal = 0;
		
		importeTotal = cuentaAsociada.getImporte();
		
		return importeTotal;
	}
	
	public double calcularConEfectivo() {
		double importeTotal = 0;
		
		importeTotal = cuentaAsociada.getImporte();
		
		return importeTotal;
	}
	
}