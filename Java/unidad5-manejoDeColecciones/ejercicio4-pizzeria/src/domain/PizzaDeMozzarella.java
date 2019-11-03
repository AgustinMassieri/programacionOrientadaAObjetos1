package domain;

import java.util.List;
import java.util.ArrayList;

public class PizzaDeMozzarella extends Producto{
	
	
	@Override
	public int hashCode() {
		return 3;
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
		return "Pizza De Mozzarella";
	}
	
	public PizzaDeMozzarella() {
		precio = 250;
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