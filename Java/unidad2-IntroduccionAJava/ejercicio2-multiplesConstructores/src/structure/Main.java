package structure;

import domain.Persona;

public class Main {

	public static void main(String[] args) {
		Persona personaUno = new Persona("Lucas", 24);
		Persona personaDos = new Persona("Martin", "12/05/1975");
		
		System.out.println(personaUno.getNombre() + " tiene " + personaUno.getEdad());
		System.out.println(personaDos.getNombre() + " tiene " + personaDos.getEdad());
	}

}
