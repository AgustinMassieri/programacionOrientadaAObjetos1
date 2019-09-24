package domain;

import domain.metodosComplementarios;

public class Perro extends Animal {
	private String raza;

	public Perro(String nombreDelAnimal, String razaDelPerro){
		super(nombreDelAnimal);
		this.raza = metodosComplementarios.normalizarTexto(raza);
	}
	
	public Perro() {
		this("","callejero");
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = metodosComplementarios.normalizarTexto(raza);
	}
	
}

