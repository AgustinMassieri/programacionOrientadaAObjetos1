package domain;

public class Perro extends Animal {
	private String raza;

	public Perro(String nombreDelAnimal, String razaDelPerro){
		super(nombreDelAnimal);//Usamos el constructor del 'padre'
		this.raza = razaDelPerro;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
}
