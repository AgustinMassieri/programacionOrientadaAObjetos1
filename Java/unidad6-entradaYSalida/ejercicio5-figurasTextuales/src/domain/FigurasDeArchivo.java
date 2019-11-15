package domain;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FigurasDeArchivo {
	
	public static Figura crearFiguraDeArchivo(String nombreDelArchivo) throws NoHayMasFigurasException, IOException{
		Figura figuraDelArchivo = null;
		
		ObjectInputStream archivoDeLectura = null;
		
		try{
			archivoDeLectura = new ObjectInputStream(new FileInputStream(nombreDelArchivo));
			figuraDelArchivo = (Figura) archivoDeLectura.readObject();			
		}
		catch(ClassNotFoundException excepcion) {
			throw new NoHayMasFigurasException();
		}
		catch(IOException excepcion) {
			throw new NoHayMasFigurasException();
		}
		
		finally{
			if(archivoDeLectura != null)
				archivoDeLectura.close();	
		}
		
		return figuraDelArchivo;
	}
}
