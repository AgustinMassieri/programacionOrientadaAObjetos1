package domain;

public class LecheCondensada extends Agregado{
	
	public LecheCondensada(Producto agregadoEncapsulado) {
		super(agregadoEncapsulado);
	}
	
	public double darPrecio() {
		return this.obtenerAgregadoEncapsulado().darPrecio() + 5;
	}
	
}