package domain;

public abstract class Agregado implements Producto{
	
	private Producto agregadoEncapsulado;
	
	public Agregado(Producto agregadoEncapsulado) {
		this.agregadoEncapsulado = agregadoEncapsulado;
	}
	
	public Producto obtenerAgregadoEncapsulado() {
		return agregadoEncapsulado;
	}
	
}