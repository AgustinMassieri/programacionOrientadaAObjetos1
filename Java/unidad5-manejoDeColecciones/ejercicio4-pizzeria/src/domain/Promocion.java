package domain;

import java.util.List;
import java.util.ArrayList;

public class Promocion extends Producto {
	List<Producto> listaDeProductosDeLaPromocion;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((listaDeProductosDeLaPromocion == null) ? 0 : listaDeProductosDeLaPromocion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Promocion other = (Promocion) obj;
		if (listaDeProductosDeLaPromocion == null) {
			if (other.listaDeProductosDeLaPromocion != null)
				return false;
		} else if (!listaDeProductosDeLaPromocion.equals(other.listaDeProductosDeLaPromocion))
			return false;
		return true;
	}

	public Promocion() {
		listaDeProductosDeLaPromocion = new ArrayList<>();
	}
	
	public void agregarProducto(Producto productoNuevo) {
		productoNuevo.aplicarDescuento();
		listaDeProductosDeLaPromocion.add(productoNuevo);
	}
	
	public double getPrecio() {
		double precio = 0;
		double sumaDeLosPrecios = 0;
		
		for(Producto productoDeLaPromocion: listaDeProductosDeLaPromocion)
			sumaDeLosPrecios += productoDeLaPromocion.getPrecio();
	
		precio = sumaDeLosPrecios;
		
		return precio;
	}
	
	public List<Producto> getListaDeUnidadesEnElProducto(){
		return listaDeProductosDeLaPromocion;
	}
	
	public void aplicarDescuento() {
		System.out.println("Ya se aplico el descuento");
	}
	
}