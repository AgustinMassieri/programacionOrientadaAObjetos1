package structure;

import domain.*;

public class Main {

	public static void main(String[] args) {
		Perro perroUno = new Perro("Keyra", "caniche");
		Perro perroDos = new Perro();
		System.out.println(perroUno.getRaza());
		System.out.println(perroDos.getRaza());
	}
	
}
