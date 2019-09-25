package domain;

public class Ave {
	private double energia;
	private String nombre;
	
	public Ave(String nombre) {
		energia = 10;
		this.nombre = nombre;
	}
	
	public boolean volar(int distancia){
		boolean pudoVolar = false;
		
		if(energia > distancia + 10) {
			energia = energia - distancia - 10;
			pudoVolar = true;
		}
		
		return pudoVolar;
	}
	
	public void comer(int gramosAComer) {
		energia += gramosAComer * 4;
	}

	public double getEnergia() {
		return energia;
	}

	public void setEnergia(double energia) {
		this.energia = energia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
