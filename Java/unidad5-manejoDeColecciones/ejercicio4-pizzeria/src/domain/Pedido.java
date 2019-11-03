package domain;

import java.util.List;
import java.util.ArrayList;

public class Pedido {
	String domicilio;
	List<Producto> listaDeProductosDelPedido;
	
	public Pedido(String domicilio) {
		this.domicilio = domicilio;
		listaDeProductosDelPedido = new ArrayList<>();
	}
	
	public void agregarProducto(Producto producto) {
		listaDeProductosDelPedido.add(producto);
		Pizzeria.registrarProducto(producto);
	}
	
}
