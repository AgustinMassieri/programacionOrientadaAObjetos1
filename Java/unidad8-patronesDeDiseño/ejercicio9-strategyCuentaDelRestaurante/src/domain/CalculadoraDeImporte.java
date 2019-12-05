package domain;

public abstract class CalculadoraDeImporte{
	protected Cuenta cuentaAsociada;
	
	public CalculadoraDeImporte(Cuenta cuentaAsociada) {
		this.cuentaAsociada = cuentaAsociada;
	}
	
	public double calcularImporte(){
		FormaDePago formaDePagoDeLaCuenta = cuentaAsociada.getFormaDePagoDeLaCuenta();
		double importeCalculado = 0;
		
		importeCalculado = formaDePagoDeLaCuenta.elegirModoDeCalculo(this);
		
		return importeCalculado;
	}
	
	public abstract double calcularConTarjeta();
	public abstract double calcularConEfectivo();
	
}