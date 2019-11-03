package domain;

public class Materia {

	private String nombreDeLaMateria;

	@Override
	public String toString() {
		return "Materia [nombreDeLaMateria=" + nombreDeLaMateria + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombreDeLaMateria == null) ? 0 : nombreDeLaMateria.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Materia other = (Materia) obj;
		if (nombreDeLaMateria == null) {
			if (other.nombreDeLaMateria != null)
				return false;
		} else if (!nombreDeLaMateria.equals(other.nombreDeLaMateria))
			return false;
		return true;
	}

	public Materia(String nombreDeLaMateria){
		this.nombreDeLaMateria = nombreDeLaMateria;
	}

	public String getNombreDeLaMateria() {
		return nombreDeLaMateria;
	}
	
	public void setNombreDeLaMateria(String nombre) {
		nombreDeLaMateria = nombre;
	}
	
}