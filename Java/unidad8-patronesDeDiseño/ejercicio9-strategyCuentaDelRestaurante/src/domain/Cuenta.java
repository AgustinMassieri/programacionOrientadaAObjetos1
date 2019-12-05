package domain;

public class Cuenta {
	private double importe;
	private CalculadoraDeImporte calculadoraDeImporte;
	private FormaDePago formaDePagoDeLaCuenta;
	
	public Cuenta(double importe, FormaDePago formaDePagoDeLaCuenta) {
		this.importe = importe;
		this.calculadoraDeImporte = new CalculadoraStandard(this);
		this.formaDePagoDeLaCuenta = formaDePagoDeLaCuenta;
	}

	public double getImporte() {
		return importe;
	}
	
	public double calcularImporte() {
		double importeFinal = 0;
		
		importeFinal = calculadoraDeImporte.calcularImporte();
		
		return importeFinal;
	}

	public void setFormaDePago(FormaDePago nuevaFormaDePago) {
		this.formaDePagoDeLaCuenta = nuevaFormaDePago;
	}
	
	public void setCalculadoraDeImporte(CalculadoraDeImporte nuevaCalculadora) {
		this.calculadoraDeImporte = nuevaCalculadora;
	}
	
	public CalculadoraDeImporte getCalculadoraDeImporte() {
		return calculadoraDeImporte;
	}

	public FormaDePago getFormaDePagoDeLaCuenta() {
		return formaDePagoDeLaCuenta;
	}
	
	
}