package domain;

import java.util.List;

public abstract class Producto {

	protected double precio;
	
	public abstract double getPrecio();
	public abstract List<Producto> getListaDeUnidadesEnElProducto();	
	public abstract void aplicarDescuento();
}