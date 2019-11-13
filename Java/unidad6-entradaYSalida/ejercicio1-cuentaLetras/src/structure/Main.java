package structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		String nombreDelArchivo = "textoRandom.txt";
		FileReader archivoDeLectura = null;
		int caracterLeidoEnFormaDeEntero;
		List<String> listaDeCaracteresDelArchivo = new ArrayList<>();
		String arregloDeLetrasDelAbecedario [] = {
				"A", "B", "C", "D", "E", "F", "G",
				"H", "I", "J", "K", "L", "M", "N",
				"Ñ", "O", "P", "Q", "R", "S", "T",
				"U", "V", "W", "X", "Y", "Z"
				};
		
		
		try{
			archivoDeLectura = new FileReader(nombreDelArchivo);
			caracterLeidoEnFormaDeEntero = archivoDeLectura.read();
					
			while(caracterLeidoEnFormaDeEntero != -1) {
				listaDeCaracteresDelArchivo.add(new String( (""+(char) caracterLeidoEnFormaDeEntero+"").toUpperCase() ) );
				caracterLeidoEnFormaDeEntero = archivoDeLectura.read();
			}
			
			for(String letraDelAbecedario : arregloDeLetrasDelAbecedario) {
				System.out.println(letraDelAbecedario + " -> " + Collections.frequency(listaDeCaracteresDelArchivo, letraDelAbecedario));
			}
			
		}
		
		finally {
			if(archivoDeLectura != null)
				archivoDeLectura.close();
		}
		
	}

}
