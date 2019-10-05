package domain;

public abstract class Material {
	protected int resistencia;
	
	@Override
	public String toString() {
		return "Material [resistencia=" + resistencia + "]";
	}

	public int getResistencia() {
		return resistencia;
	}
	
}