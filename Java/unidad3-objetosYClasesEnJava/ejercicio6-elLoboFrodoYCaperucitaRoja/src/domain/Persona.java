package domain;

public class Persona {
	double peso;
	Canasta canasta;
	
	@Override
	public String toString() {
		return "Persona [peso=" + peso + ", canasta=" + canasta + "]";
	}
	
	public Persona() {
		this.peso = 0;
	}
	
	public Persona(double peso) {
		this.peso = peso;
	}
	
	public Persona(double peso, Canasta canasta) {
		this.peso = peso;
		this.canasta = canasta;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Canasta getCanasta() {
		return canasta;
	}

	public void setCanasta(Canasta canasta) {
		this.canasta = canasta;
	}
	
	public void atacarAlLobo(Lobo lobo){
		Fruta frutaATirar = canasta.sacarYDevolverUltimaFruta();
		lobo.comerFruta(frutaATirar);
	}
	
}