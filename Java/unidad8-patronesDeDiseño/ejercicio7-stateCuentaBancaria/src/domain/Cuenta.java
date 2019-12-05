package domain;

public class Cuenta {
	
	private double monto = 0;
	private Estado estadoDeLaCuenta;
	private boolean estaCerrada = false;
	
	@Override
	public String toString() {
		return "Cuenta [monto=" + monto + ", estadoDeLaCuenta=" + estadoDeLaCuenta + "]";
	}

	public Cuenta() {
		estadoDeLaCuenta = new Normal(this);
	}
	
	public void depositarDinero(double monto){
		estadoDeLaCuenta.depositarDinero(monto);
		this.actualizarEstado();
	}
	
	public void extraerDinero(double monto){
		estadoDeLaCuenta.extraerDinero(monto);
		this.actualizarEstado();
	}

	public void incrementarMonto(double monto) {
		this.monto += monto;
	}

	public void disminuirMonto(double monto) {
		this.monto -= monto;
	}
	
	public double getMonto() {
		return this.monto;
	}
	
	private void actualizarEstado() {
		
		if( estaCerrada == false ) {
			if(monto >= 0) {
				estadoDeLaCuenta = new Normal(this);
			}
			else if(monto < 0) {
				estadoDeLaCuenta = new Rojo(this);
			}
		}
		
	}
	
	public void cerrarCuenta() {	
		estadoDeLaCuenta = new Cerrada(this);
		estaCerrada = true;
	}
	
}