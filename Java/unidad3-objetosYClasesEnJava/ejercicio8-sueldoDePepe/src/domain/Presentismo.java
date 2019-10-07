package domain;

public class Presentismo extends Bono {

	public double getValor(Empleado empleado) {
		int cantidadDeFaltas = empleado.getCantidadDeFaltas();
		double valor;
		
		if(cantidadDeFaltas == 0)
			valor = 100;
		else if(cantidadDeFaltas == 1)
			valor = 50;
		else
			valor = 0;
		
		return valor;
	}
	
}