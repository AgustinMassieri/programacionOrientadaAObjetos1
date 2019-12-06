package domain;

public class Leche extends Agregado{
	
	public Leche(Producto agregadoEncapsulado) {
		super(agregadoEncapsulado);
	}
	
	public double darPrecio() {
		return this.obtenerAgregadoEncapsulado().darPrecio() + 5;
	}
	
}