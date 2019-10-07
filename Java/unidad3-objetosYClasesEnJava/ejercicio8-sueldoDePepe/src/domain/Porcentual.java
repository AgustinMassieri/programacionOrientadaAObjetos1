package domain;

public class Porcentual extends Resultados {
	
	public double getValor(Empleado empleado) {
		int porcentaje = 10; //es 12%
		double netoDelEmpleado = empleado.getNeto();
		double valor;
		
		valor = ( (porcentaje/100) + 1 ) * netoDelEmpleado;
		
		return valor;
		
	}
	
}
