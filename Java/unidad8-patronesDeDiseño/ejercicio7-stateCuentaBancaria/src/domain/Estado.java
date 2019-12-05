package domain;

public abstract class Estado {
	Cuenta cuentaAsociada;

	public Estado(Cuenta cuentaAsociada) {
		this.cuentaAsociada = cuentaAsociada;
	}
	
	public abstract void depositarDinero(double monto);
	public abstract void extraerDinero(double monto);
}
