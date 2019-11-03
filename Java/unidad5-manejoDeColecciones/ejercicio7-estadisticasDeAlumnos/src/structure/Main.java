package structure;

import domain.*;

public class Main {

	public static int generarNumeroDeFaltasRandom() {
		return  (int) (Math.random() * (30 - 0));
	}
	
	public static int generarNumeroDeNotasRandom() {
		return  (int) (Math.random() * (5 - 0));
	}
	
	public static int generarNotaRandom() {
		return  (int) (Math.random() * (10 - 1));
	}
	
	public static int generarNumeroDeTrimestre() {
		return  (int) (Math.random() * (3 - 1));
	}
		
	public static void main(String[] args) {
		
		Materia [] materias = {
				new Materia("Biologia"),
				new Materia("Matematica"),
				new Materia("Historia"),
				new Materia("Gimnasia"),
				};
		
		Alumno [] alumnos = {
				new Alumno(),
				new Alumno(),
				new Alumno(),
				new Alumno(),
				new Alumno(),
				new Alumno(),
				new Alumno(),
				new Alumno(),
				new Alumno(),
				new Alumno(),
				new Alumno(),
				new Alumno(),
				new Alumno(),
				new Alumno(),
				new Alumno(),
				new Alumno(),
				new Alumno()		
		};
		
		for(Alumno alumno: alumnos) {
			int numero = generarNumeroDeFaltasRandom();
			
			//GENERAMOS FALTAS RANDOM
			
			for(int i= 0;i<numero;i++) {
				alumno.agregarFalta(new Falta(true));
			}
			
			//GENERAMOS NOTAS RANDOM
			
			for(Materia materia: materias) {
				
				numero = generarNumeroDeNotasRandom();
				
				for(int i= 0;i<numero;i++) {
					int numeroDeTrimestre = generarNumeroDeTrimestre();
					
					alumno.agregarNota(new Nota(generarNotaRandom(), numeroDeTrimestre, materia));
					
				}
				
			}

		}
		
		
		
		
		
		
		
	}

}
