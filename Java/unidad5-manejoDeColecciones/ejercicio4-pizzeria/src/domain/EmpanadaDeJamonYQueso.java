package domain;

import java.util.ArrayList;
import java.util.List;

public class EmpanadaDeJamonYQueso extends Empanada {
	
	@Override
	public int hashCode() {
		return 2;
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(o.hashCode() == this.hashCode())
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Empanada De Jamon Y Queso";
	}

	public EmpanadaDeJamonYQueso(){
		precio = 20;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public List<Producto> getListaDeUnidadesEnElProducto(){
		List<Producto> listaADevolver = new ArrayList<>();
		listaADevolver.add(this);
		return listaADevolver;
	}
	
	public void aplicarDescuento() {
		precio = precio * 0.75;
	}
}
