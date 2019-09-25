package structure;

import domain.*;

public class Main {

	public static void main(String[] args) {
		Rectangulo rectanguloUno = new Rectangulo(5,6);
		Circulo circuloUno = new Circulo(2.3);
		Triangulo trianguloUno = new Triangulo(1.2,6.5);
		
		System.out.println(rectanguloUno.calcularArea());
		System.out.println(circuloUno.calcularArea());
		System.out.println(trianguloUno.calcularArea());

	}

}
