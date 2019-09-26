package domain;

public class Ave {
	private double energia;
	private String nombre;
	
	public Ave(String nombre){
		energia = 100;
		this.nombre = nombre;
	}
	
	@Override //Se pone siempre y cuando redefinamos. Se optimiza compilacion
	public String toString(){
		return "Me llamo " + nombre + " y tengo " + energia;
	}
	
	@Override
	public boolean equals(Object objetoEnComparacion) {
		boolean sonIguales = false;
		Ave auxiliar = null;
		
		if(objetoEnComparacion != null && objetoEnComparacion instanceof Ave) {
			auxiliar = (Ave) objetoEnComparacion;
			
			if(nombre.equals(auxiliar.getNombre()) && auxiliar.getEnergia() == energia)
				sonIguales = true;
			
		}
		
		return sonIguales;
	}
	
	@Override
	public int hashCode() {
		return (int) (energia * 7 + nombre.length());
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
