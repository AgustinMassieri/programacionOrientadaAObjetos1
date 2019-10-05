package domain;

public class Ladrillo extends Material {
	
	@Override
	public String toString() {
		return "Ladrillo";
	}
	
	public Ladrillo(){
		resistencia = 2;
	}
	
}