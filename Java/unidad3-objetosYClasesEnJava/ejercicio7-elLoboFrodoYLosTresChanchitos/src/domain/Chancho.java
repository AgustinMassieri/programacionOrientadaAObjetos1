package domain;

public class Chancho extends Animal{
	private int peso;
	
	@Override
	public String toString() {
		return "Chancho [peso=" + peso + ", lugar=" + lugar + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + peso;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chancho other = (Chancho) obj;
		if (peso != other.peso)
			return false;
		return true;
	}

	public Chancho(){
		peso = 50;
	}
	
	public Chancho(int peso){
		this.peso = peso;
	}
	
	public Chancho(int peso, Lugar lugar){
		this.lugar = lugar;
		this.peso = peso;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void ingresarCasa(Casa casa) {
		if(casa.equals(lugar)){
			casa.ingresarChancho(this);
		}
	}
	
	public void salirDeCasa(Casa casa){
		if(casa.equals(lugar)){
			casa.sacarChancho(this);
		}
	}
	
	public void correrA(Lugar lugar) {
		this.lugar = lugar;
	}
	
}
