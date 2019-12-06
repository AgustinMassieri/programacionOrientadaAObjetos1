package domain;

import java.util.List;
import java.util.ArrayList;

public class Carpeta implements Unidad {
	
	private List<Unidad> listaDeUnidadesEnLaCarpeta;
	
	public Carpeta() {
		listaDeUnidadesEnLaCarpeta = new ArrayList<>();
	}
	
	public void agregarUnidad(Unidad unidadNueva) {
		listaDeUnidadesEnLaCarpeta.add(unidadNueva);
	}
	
	public void borrarUnidad(Unidad unidadNueva) {
		listaDeUnidadesEnLaCarpeta.remove(unidadNueva);
	}
	
	public double tamañoTotal() {
		double tamañoTotal = 0;
		
		for(Unidad unidadDeLaLista: listaDeUnidadesEnLaCarpeta)
			tamañoTotal += unidadDeLaLista.tamañoTotal();
		
		return tamañoTotal;
	}
}
