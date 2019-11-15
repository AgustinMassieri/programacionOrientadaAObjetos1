package structure;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import domain.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		/*
		Circulo circuloUno = new Circulo(5);
		Triangulo trianguloUno = new Triangulo(12.3,5);
		Rectangulo rectanguloUno = new Rectangulo(10.1,9.9);
		
		
		//Con este codigo generamos a los archivos
		ObjectOutputStream archivoDeCirculo = new ObjectOutputStream(new FileOutputStream("circulo.fig"));
		ObjectOutputStream archivoDeRectangulo = new ObjectOutputStream(new FileOutputStream("rectangulo.fig"));
		ObjectOutputStream archivoDeTriangulo = new ObjectOutputStream(new FileOutputStream("triangulo.fig"));

		archivoDeCirculo.writeObject(circuloUno);
		archivoDeRectangulo.writeObject(rectanguloUno);
		archivoDeTriangulo.writeObject(trianguloUno);

		archivoDeCirculo.close();
		archivoDeRectangulo.close();
		archivoDeTriangulo.close();
		*/
		
		try {
			System.out.println(FigurasDeArchivo.crearFiguraDeArchivo("triangulo.fig"));
		}
		catch(NoHayMasFigurasException excepcion) {
			System.out.println(excepcion);
		}
		
	}
	
}