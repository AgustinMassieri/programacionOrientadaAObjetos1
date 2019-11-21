package structure;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import domain.*;


public class Main {

	public static void main(String[] args) {
		PrintWriter archivoCSV = null;
		Alumno arregloDeAlumnos[] = {
				new Alumno("Lucas","Saavedra", 20),
				new Alumno("Alberto","Romaniquich", 36),
				new Alumno("Roman","Riquelme",39),
				new Alumno("Esteban","Echeverria",40),
				new Alumno("Santos","Roca",19)
		};
		
		try {
			archivoCSV = new PrintWriter( new FileWriter("alumnos.csv") );
		
			
			
			
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	
	
	
	}

}
