package domain;

public class Coyote extends Animal {
	
	public Coyote(int peso, int posicion, int energia) {
		super(peso, posicion, energia);
	}
		
	@Override
	public String toString() {
		return "Coyote [peso=" + peso + ", energia=" + energia + ", posicion=" + posicion + " velocidad="+ this.obtenerVelocidad() +"]";
	}
	
	public double obtenerVelocidad() {
		double velocidad;
		
		velocidad = 5 + (energia/10);
		
		return Math.abs(velocidad);
	}
	
	public boolean puedeAtraparCorrecaminos(Correcaminos correcaminos) {
		boolean puedeAtraparCorrecaminos = false;
		double velocidadDelCorrecaminos = correcaminos.obtenerVelocidad();
		double velocidadDelCoyote = this.obtenerVelocidad();
				
		if (velocidadDelCoyote > velocidadDelCorrecaminos)
			puedeAtraparCorrecaminos = true;
		
		return puedeAtraparCorrecaminos;
	}
	
	public boolean correrAlCorrecaminos(Correcaminos correcaminos) {
		boolean pudoCorrerlo = false;
		double velocidadDelCoyote = this.obtenerVelocidad();
		int posicionDelCorrecaminos = correcaminos.getPosicion();
		int distanciaEntreEllos = Math.abs(posicionDelCorrecaminos-posicion);
		
		if(distanciaEntreEllos == 0)
			pudoCorrerlo = true;
		else if(puedeAtraparCorrecaminos(correcaminos) && energia >= 0.5 * velocidadDelCoyote * distanciaEntreEllos) {
			pudoCorrerlo = true;
			energia -=  0.5 * velocidadDelCoyote * distanciaEntreEllos;
			posicion = posicionDelCorrecaminos;
		}
		
		return pudoCorrerlo;
	}
	
	public boolean comerAlCorrecaminos(Correcaminos correcaminos) {
		boolean pudoComer = false;
		
		if(correrAlCorrecaminos(correcaminos)) {
			peso += 12;
			pudoComer = true;
		}
		
		return pudoComer;
	}
	
}
