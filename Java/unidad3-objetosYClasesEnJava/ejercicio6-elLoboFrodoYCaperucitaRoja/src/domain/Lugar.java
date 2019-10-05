package domain;

public class Lugar {
	private String nombre;
	private int distancia;
	
	@Override
	public String toString() {
		return "Lugar [nombre=" + nombre + ", distancia=" + distancia + "]";
	}

	public static int obtenerDistanciaEntreLugares(Lugar lugarOrigen, Lugar lugarDestino) {
		int distancia;
		
		distancia = Math.abs(lugarOrigen.getDistancia() - lugarDestino.getDistancia());
		
		return distancia;
	}
	
	public Lugar(String nombre, int distancia) {
		this.nombre = nombre;
		this.distancia = distancia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
}
