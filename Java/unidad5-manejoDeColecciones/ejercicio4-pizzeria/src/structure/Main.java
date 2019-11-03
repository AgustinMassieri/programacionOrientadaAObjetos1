package structure;

import domain.*;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		EmpanadaDeJamonYQueso empanadaDeJamonYQueso = new EmpanadaDeJamonYQueso();
		EmpanadaDeCarne empanadaDeCarne = new EmpanadaDeCarne();
		PizzaDeMozzarella pizzaDeMozzarella = new PizzaDeMozzarella();

		Promocion promocionUno = new Promocion();
		promocionUno.agregarProducto(empanadaDeCarne);
		promocionUno.agregarProducto(empanadaDeCarne);
		promocionUno.agregarProducto(empanadaDeCarne);
		promocionUno.agregarProducto(empanadaDeJamonYQueso);
		promocionUno.agregarProducto(empanadaDeJamonYQueso);
		promocionUno.agregarProducto(empanadaDeJamonYQueso);
		promocionUno.agregarProducto(pizzaDeMozzarella);
		
		
		Pedido primerPedido = new Pedido("Pueyrredon 1944");
		primerPedido.agregarProducto(promocionUno);
		primerPedido.agregarProducto(promocionUno);
		primerPedido.agregarProducto(empanadaDeCarne);
		primerPedido.agregarProducto(empanadaDeCarne);
		primerPedido.agregarProducto(empanadaDeCarne);
		
		Pizzeria.imprimirSaborMasVendido();
		System.out.println(Pizzeria.getTotalVendido());
	}

}
