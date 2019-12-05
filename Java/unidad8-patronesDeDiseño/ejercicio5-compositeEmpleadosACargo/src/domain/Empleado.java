package domain;

import java.util.List;
import java.util.ArrayList;

public class Empleado{
	
	private List<Empleado> listaDeEmpleadosACargo = new ArrayList<>();

	public void agregarEmpleado(Empleado empleadoNuevo){
		listaDeEmpleadosACargo.add(empleadoNuevo);
	}
	
	public void borrarEmpleado(Empleado empleadoABorrar){
		listaDeEmpleadosACargo.remove(empleadoABorrar);
	}
	
	public double entregarCantidadDeEmpleadosACargo() {
		int cantidadDeEmpleadoACargo = 0;
		
		cantidadDeEmpleadoACargo = listaDeEmpleadosACargo.size();

		return cantidadDeEmpleadoACargo;
	}
	
}