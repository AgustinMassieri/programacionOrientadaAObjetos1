package domain;

public class Canela extends Agregado{
	
	public Canela(Producto agregadoEncapsulado) {
		super(agregadoEncapsulado);
	}
	
	public double darPrecio() {
		return this.obtenerAgregadoEncapsulado().darPrecio() + 5;
	}
	
}