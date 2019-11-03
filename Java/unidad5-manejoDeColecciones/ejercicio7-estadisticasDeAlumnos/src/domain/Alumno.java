package domain;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Alumno {
	private List<Nota> listaDeNotas;
	private List<Falta> listaDeFaltas;
	
	public Alumno(){
		listaDeNotas = new ArrayList<>();
		listaDeFaltas = new ArrayList<>();
	}
	
	public void agregarNota(Nota nuevaNota){
		listaDeNotas.add(nuevaNota);
	}
	
	public void agregarFalta(Falta nuevaFalta) {
		listaDeFaltas.add(nuevaFalta);
	}
	
	public boolean seQuedoLibre() {
		int cantidadDeFaltas = listaDeFaltas.size();
		int cantidadDeFaltasNoJustificadas = 0;
		boolean seQuedoLibre = false;
		
		for(Falta falta: listaDeFaltas) {
			if(falta.noEstaJustificada())
				cantidadDeFaltasNoJustificadas++;
		}
		
		if(cantidadDeFaltasNoJustificadas > 15 || cantidadDeFaltas > 25)
			seQuedoLibre = true;

		return seQuedoLibre;
	}
	
	public boolean puedeRepetir() {
		boolean puedeRepetir = false;
		
		if(puedeRepetirPorMaterias() || seQuedoLibre()) {
			puedeRepetir = true;
		}
			
		
		return puedeRepetir;
	}
	
	public boolean puedeRepetirPorMaterias() {
		boolean puedeRepetirPorMaterias = false;
		int cantidadDeMateriasDesaprobadas = 0;
		
		Set<Materia> setDeMateriasQueCursa = new HashSet<>();
		
		for(Nota nota: listaDeNotas)
			setDeMateriasQueCursa.add(nota.getMateria());
		
		for(Materia materia: setDeMateriasQueCursa) {
			
			if(!aproboLaMateria(materia))
				cantidadDeMateriasDesaprobadas++;
			
		}
	
		
		if(cantidadDeMateriasDesaprobadas > 2)
			puedeRepetirPorMaterias = true;		
		
		return puedeRepetirPorMaterias;
	}
	
	public boolean aproboLaMateria(Materia materia) {
		boolean aprobo = true;
		float promedioTotal = darPromedioDeNotasDeMateria(materia);
		float promedioDelTercerTrimestre = darPromedioDeNotasDeMateriaDelTrimestre(materia, 3);

		if( promedioDelTercerTrimestre < 6 && promedioTotal < 6) {
			aprobo = false;
		}
		
		return aprobo;
	}
	
	private float darPromedioDeNotasDeMateriaDelTrimestre(Materia materia, int numeroDeTrimestre){
		float promedio = 0;
		float sumaDeNotas = 0;
		int cantidadDeNotas = 0;
		Materia materiaDeLaNotaDeLaLista;
		
		for(Nota notaDeLaLista: listaDeNotas) {
			
			materiaDeLaNotaDeLaLista = notaDeLaLista.getMateria();

			if(materiaDeLaNotaDeLaLista.equals(materia) && notaDeLaLista.getNumeroDeTrimestre() == numeroDeTrimestre) {
				sumaDeNotas+=notaDeLaLista.getCalificacion();
				cantidadDeNotas++;
			}

		}
	
		if(cantidadDeNotas != 0) {
			promedio = sumaDeNotas / cantidadDeNotas;
		}
		
		return promedio;
	}
	
	private float darPromedioDeNotasDeMateria(Materia materia){
		float promedio = 0;
		float sumaDePromedios = 0;
		
		sumaDePromedios += darPromedioDeNotasDeMateriaDelTrimestre(materia, 1);
		sumaDePromedios += darPromedioDeNotasDeMateriaDelTrimestre(materia, 2);
		sumaDePromedios += darPromedioDeNotasDeMateriaDelTrimestre(materia, 3);
		
		promedio = sumaDePromedios / 3;
		
		return promedio;
	}
	
}