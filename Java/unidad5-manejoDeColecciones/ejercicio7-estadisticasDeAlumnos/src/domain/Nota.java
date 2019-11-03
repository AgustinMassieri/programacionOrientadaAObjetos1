package domain;

public class Nota {
	private float calificacion;
	private int numeroDeTrimestre;
	private Materia materia;

	@Override
	public String toString() {
		return "Nota [calificacion=" + calificacion + ", numeroDeTrimestre=" + numeroDeTrimestre + ", materia="
				+ materia + "]";
	}

	public Nota(float calificacion, int numeroDeTrimestre, Materia materia){
		this.calificacion = calificacion;
		this.numeroDeTrimestre = numeroDeTrimestre;
		this.materia = materia;
	}

	public float getCalificacion() {
		return calificacion;
	}

	public int getNumeroDeTrimestre() {
		return numeroDeTrimestre;
	}

	public Materia getMateria() {
		return materia;
	}
	
}
