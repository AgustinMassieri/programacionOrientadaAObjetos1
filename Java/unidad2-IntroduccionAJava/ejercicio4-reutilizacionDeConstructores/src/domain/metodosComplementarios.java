package domain;

public class metodosComplementarios {
	
	public static String normalizarTexto(String texto){
		String textoNormalizado = "";
		String palabrasDelTexto [] = texto.split(" ");
		String palabra;
		int largoDeLaPalabra = 0;
		int cantidadDePalabras = palabrasDelTexto.length;
		int indiceDePalabras = 0;
		
		while(indiceDePalabras < cantidadDePalabras) {
			palabra = palabrasDelTexto[indiceDePalabras];
			palabra.toLowerCase();
			largoDeLaPalabra = palabra.length();
			palabra = palabra.substring(0, 1).toUpperCase() + palabra.substring(1,largoDeLaPalabra);
			palabrasDelTexto[indiceDePalabras] = palabra;
			indiceDePalabras++;
		}
		
		indiceDePalabras = 0;
		textoNormalizado = palabrasDelTexto[indiceDePalabras];
		indiceDePalabras++;
		
		while(indiceDePalabras < cantidadDePalabras) {
			textoNormalizado = textoNormalizado + " " + palabrasDelTexto[indiceDePalabras];
			indiceDePalabras++;
		}
		
		return textoNormalizado;
	}
}
