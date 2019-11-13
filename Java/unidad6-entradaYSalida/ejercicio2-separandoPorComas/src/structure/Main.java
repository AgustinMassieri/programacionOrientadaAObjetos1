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
	
	public static void main(String[] args) throws IOException{
		
		String nombreDelArchivo = "empleados.csv";
		String stringAEscribir = null;
		String stringLeido = null;
		BufferedReader archivoDeLectura = null;
		PrintWriter archivoDeEscritura = null;
		
		List<Empleado> listaDeEmpleados = new ArrayList<>();
		listaDeEmpleados.add(new Empleado(111000536,"lucas","saavedra",46538583));
		listaDeEmpleados.add(new Empleado(151012131,"martin","king",25541213));
		listaDeEmpleados.add(new Empleado(121100101,"alvaro","calvo",20041213));
		listaDeEmpleados.add(new Empleado(171000151,"martin","aloja",25234546));
		listaDeEmpleados.add(new Empleado(111177771,"carl","johnson",46500005));

		//Guardamos a los empleados...
		try {
			
			archivoDeEscritura = new PrintWriter(new FileWriter(nombreDelArchivo));
			
			for(Empleado empleadoDeLaLista: listaDeEmpleados) {
				
				stringAEscribir = new String( empleadoDeLaLista.getLegajo() + "," 
											+ empleadoDeLaLista.getNombre() + "," 
											+ empleadoDeLaLista.getApellido() + "," 
											+ empleadoDeLaLista.getTelefono()
											);
				
				archivoDeEscritura.println(stringAEscribir);
				
			}
			
		}
		
		finally {
			
			if(archivoDeEscritura != null) {
				archivoDeEscritura.close();
			}
			
		}
		
		
		//Leemos a los empleados...
		try {
			
			archivoDeLectura = new BufferedReader(new FileReader(nombreDelArchivo));
			
			stringLeido = archivoDeLectura.readLine();
			
			while(stringLeido != null) {
				System.out.println(stringLeido);
				stringLeido = archivoDeLectura.readLine();
			}
			
		}
		
		finally {
			
			if(archivoDeLectura != null) {
				archivoDeLectura.close();
			}
			
		}
		
	}
	
}