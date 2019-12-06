package domain;

public class Chocolate extends Agregado{
	
	public Chocolate(Producto agregadoEncapsulado) {
		super(agregadoEncapsulado);
	}
	
	public double darPrecio() {
		return this.obtenerAgregadoEncapsulado().darPrecio() + 5;
	}
	
}