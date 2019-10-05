package domain;

public class Lobo extends Animal{
	private double grasa;
	private Estado estado;
	
	@Override
	public String toString() {
		return "Lobo [grasa=" + grasa + ", estado=" + estado + ", lugar="+ lugar +"]";
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		long temp;
		temp = Double.doubleToLongBits(grasa);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lobo other = (Lobo) obj;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (Double.doubleToLongBits(grasa) != Double.doubleToLongBits(other.grasa))
			return false;
		return true;
	}

	public Lobo(double grasa) {
		setGrasa(grasa);
		lugar = new Lugar("Cueva", 0);
	}
	
	public Lobo(double grasa, Lugar lugar) {
		setGrasa(grasa);
		this.lugar = lugar;
	}
	
	public double getGrasa() {
		return grasa;
	}

	private void setGrasa(double grasa) {
		this.grasa = grasa;
		
		if(grasa > 200) {
			estado = new Gordo();
		}
		else {
			estado = new Saludable();
		}
	}

	public Estado getEstado() {
		return estado;
	}
	
	private void aumentarGrasa(double grasa) {
		double grasaNueva = this.grasa + grasa;
		setGrasa(grasaNueva);
	}
	
	private void disminuirGrasa(double grasa) {
		double nuevaGrasa = this.grasa - grasa;
		
		if(nuevaGrasa < 0)
			nuevaGrasa = 0;
		
		setGrasa(nuevaGrasa);
	}
	
	public void soplarCasa(Casa casa){
		int resistenciaDeLaCasa = casa.getResistencia();
		int pesoDeLaCasa = casa.getPeso();
		int grasaAPerder = resistenciaDeLaCasa + pesoDeLaCasa;
		
		disminuirGrasa(grasaAPerder);		
	}
	
	public boolean correr(int minutos) {
		double grasaAConsumir = 2 * minutos; //2 gramos por minuto
		
		if(grasa == 0) {
			return false;
		}
		else {
			disminuirGrasa(grasaAConsumir);
			return true;
		}
	}
	
	public void correrA(Lugar lugar){
		int distanciaACorrer = Lugar.obtenerDistanciaEntreLugares(this.lugar, lugar);
		
		if(correr(distanciaACorrer)) {
			this.lugar = lugar;
		}
	}
	
	public void imprimirEstado() {
		System.out.println("Estoy " + estado);
	}
	
}