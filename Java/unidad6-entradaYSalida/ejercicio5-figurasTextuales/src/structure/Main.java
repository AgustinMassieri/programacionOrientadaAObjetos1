package structure;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import domain.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		Circulo circuloUno = new Circulo(5);
		Triangulo trianguloUno = new Triangulo(12.3,5);
		Rectangulo rectanguloUno = new Rectangulo(10.1,9.9);
		
		try {
			System.out.println(FigurasDeArchivo.crearFiguraDeArchivo("triangulo.fig"));
		}
		catch(NoHayMasFigurasException excepcion) {
			System.out.println(excepcion);
		}
		
	}
	
}