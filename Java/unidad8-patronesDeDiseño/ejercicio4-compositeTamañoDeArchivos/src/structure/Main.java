package structure;

import domain.Archivo;
import domain.Carpeta;

public class Main {

	public static void main(String[] args) {
		/*
		 * 
		 * Diagrama de lo que pruebo
		 * 
		 * Carpeta Principal
		 * 		--->CarpetaUno
		 * 				ArchivoUno
		 * 				ArchivoDos
		 * 				ArchivoTres
		 * 		--->CarpetaDos
		 * 				ArchivoCuatro
		 * 		ArchivoCinco
		 * 
		 */
		
		Archivo archivoUno = new Archivo(1);
		Archivo archivoDos = new Archivo(2);
		Archivo archivoTres = new Archivo(3);
		Archivo archivoCuatro = new Archivo(4);
		Archivo archivoCinco = new Archivo(5);

		Carpeta carpetaPrincipal = new Carpeta();
		Carpeta carpetaUno = new Carpeta();
		Carpeta carpetaDos = new Carpeta();

		carpetaUno.agregarUnidad(archivoUno);
		carpetaUno.agregarUnidad(archivoDos);
		carpetaUno.agregarUnidad(archivoTres);
		
		carpetaDos.agregarUnidad(archivoCuatro);

		carpetaPrincipal.agregarUnidad(carpetaUno);
		carpetaPrincipal.agregarUnidad(carpetaDos);
		carpetaPrincipal.agregarUnidad(archivoCinco);

		System.out.println("La carpeta principal pesa " + carpetaPrincipal.tamañoTotal());
		System.out.println("La carpeta uno pesa " + carpetaUno.tamañoTotal());
		System.out.println("La carpeta dos pesa " + carpetaDos.tamañoTotal());

	}

}
