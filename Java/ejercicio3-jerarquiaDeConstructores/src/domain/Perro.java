package domain;

public class Perro extends Animal {
	private String raza;

	public Perro(String nombreDelAnimal, String razaDelPerro){
		super(nombreDelAnimal);//Usamos el constructor del 'padre'
		this.raza = razaDelPerro;
	}
	
	public String darRaza() {
		return this.raza;
	}
	
}
