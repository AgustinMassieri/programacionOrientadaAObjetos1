package structure;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import domain.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		String nombreDelArchivo = "empleados.dat";
		DataInputStream archivoDeLectura = null;
		DataOutputStream archivoDeEscritura = null;
		
		int telefonoLeido;
		String nombreLeido;
		String apellidoLeido;
		int legajoLeido;
		
		List<Empleado> listaDeEmpleados = new ArrayList<>();
		listaDeEmpleados.add(new Empleado(111000536,"lucas","saavedra",46538583));
		listaDeEmpleados.add(new Empleado(151012131,"martin","king",25541213));
		listaDeEmpleados.add(new Empleado(121100101,"alvaro","calvo",20041213));
		listaDeEmpleados.add(new Empleado(171000151,"martin","aloja",25234546));
		listaDeEmpleados.add(new Empleado(111177771,"carl","johnson",46500005));

		//Guardamos a los empleados...
		try {
			
			archivoDeEscritura = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(nombreDelArchivo)));
			
			for(Empleado empleadoDeLaLista: listaDeEmpleados) {
				archivoDeEscritura.writeInt(empleadoDeLaLista.getLegajo());
				archivoDeEscritura.writeUTF(empleadoDeLaLista.getNombre());
				archivoDeEscritura.writeUTF(empleadoDeLaLista.getApellido());
				archivoDeEscritura.writeInt(empleadoDeLaLista.getTelefono());
			}
		}
		
		finally {
			
			if(archivoDeEscritura != null) {
				archivoDeEscritura.close();
			}
			
		}
		
		
		//Leemos a los empleados...
		try {
			
			archivoDeLectura = new DataInputStream(new BufferedInputStream( new FileInputStream(nombreDelArchivo)));

			while(true){
				legajoLeido = archivoDeLectura.readInt();
				nombreLeido = archivoDeLectura.readUTF();
				apellidoLeido = archivoDeLectura.readUTF();
				telefonoLeido = archivoDeLectura.readInt();
				
				System.out.println(legajoLeido + "," + nombreLeido + "," + apellidoLeido + "," + telefonoLeido);
			}
			
		}
		catch (EOFException e) {
			System.out.println("LECTURA FINALIZADA");
		}
		
		finally {
			
			if(archivoDeLectura != null) {
				archivoDeLectura.close();
			}
			
		}
		
	}
	
}