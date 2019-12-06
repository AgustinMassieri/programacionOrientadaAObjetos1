package domain;

public class Crema extends Agregado{
	
	public Crema(Producto agregadoEncapsulado) {
		super(agregadoEncapsulado);
	}
	
	public double darPrecio() {
		return this.obtenerAgregadoEncapsulado().darPrecio() + 6;
	}
	
}