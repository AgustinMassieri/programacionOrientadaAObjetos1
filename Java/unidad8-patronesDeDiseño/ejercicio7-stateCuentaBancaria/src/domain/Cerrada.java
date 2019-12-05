package domain;

public class Cerrada extends Estado{

	@Override
	public String toString() {
		return "Cerrada []";
	}

	public Cerrada(Cuenta cuentaAsociada) {
		super(cuentaAsociada);
	}
	
	public void depositarDinero(double monto){}
	public void extraerDinero(double monto){
		double montoEnLaCuenta = cuentaAsociada.getMonto();
		
		if(montoEnLaCuenta >= monto)
			cuentaAsociada.disminuirMonto(monto);
		
	}
	
}
