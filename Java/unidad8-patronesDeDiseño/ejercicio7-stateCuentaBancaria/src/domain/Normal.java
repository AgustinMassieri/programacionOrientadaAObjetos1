package domain;

public class Normal extends Estado {
	
	@Override
	public String toString() {
		return "Normal []";
	}

	public Normal(Cuenta cuentaAsociada) {
		super(cuentaAsociada);
	}
	
	public void depositarDinero(double monto){
		cuentaAsociada.incrementarMonto(monto);
	}
	
	public void extraerDinero(double monto){
		cuentaAsociada.disminuirMonto(monto);
	}
	
}