package domain;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class Pizzeria {
	private static List<Producto> listaDeProductosVendidos = new ArrayList<>();
	private static Set<Producto> setDeCategoriasDeProductosVendidos = new HashSet<>();
	
	public static void registrarProducto(Producto producto) {
		List<Producto> listaDeUnidadesEnElProducto = producto.getListaDeUnidadesEnElProducto();
		listaDeProductosVendidos.addAll(listaDeUnidadesEnElProducto);
		setDeCategoriasDeProductosVendidos.addAll(listaDeUnidadesEnElProducto);
	}
	
	public static float getTotalVendido() {
		float totalVendido = 0;
		
		for(Producto producto: listaDeProductosVendidos)
			totalVendido+= producto.getPrecio();
		
		return totalVendido;
	}
	
	public static void imprimirSaborMasVendido() {
		int cantidadDelProductoMasVendidoHastaAhora = 0;
		int cantidadAuxiliar = 0;
		Producto productoMasVendido = null;
		
		for(Producto categoriaDeProducto: setDeCategoriasDeProductosVendidos) {
			
			cantidadAuxiliar = Collections.frequency(listaDeProductosVendidos, categoriaDeProducto);
			
			if(cantidadAuxiliar > cantidadDelProductoMasVendidoHastaAhora) {
				productoMasVendido = categoriaDeProducto;
				cantidadDelProductoMasVendidoHastaAhora = cantidadAuxiliar;		
			}
			
		}
		
		System.out.println("El producto mas vendido es " + productoMasVendido +" ("+cantidadDelProductoMasVendidoHastaAhora+")");
		
	}
		
}