package domain;

public class Rojo extends Estado {
	
	@Override
	public String toString() {
		return "Rojo []";
	}

	public Rojo(Cuenta cuentaAsociada) {
		super(cuentaAsociada);
	}
	
	public void depositarDinero(double monto){
		cuentaAsociada.incrementarMonto(monto);
	}
	
	public void extraerDinero(double monto){}
	
}