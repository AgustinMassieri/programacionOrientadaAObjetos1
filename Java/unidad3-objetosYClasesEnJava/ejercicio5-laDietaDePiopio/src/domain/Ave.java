package domain;

public class Ave {
	private double energia;
	private String nombre;
	private Estado satisfaccion;
	private Estado digestion;
	
	public Ave(String nombre){
		setEnergia(100);
		this.nombre = nombre;	
	}
	
	@Override //Se pone siempre y cuando redefinamos. Se optimiza compilacion
	public String toString(){
		return "Me llamo " + nombre + " y tengo " + energia + " de energia. Estoy " + satisfaccion + " y "+ digestion +".";
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

	public double getEnergia() {
		return energia;
	}

	private void setEnergia(double energia) {
		this.energia = energia;
		
		if(energia > 100)
			digestion = new Empachado();
		else
			digestion = new Indigesto();
		
		if(50 < this.energia && this.energia < 100)
			satisfaccion = new Satisfecho();
		else
			satisfaccion = new Insatisfecho();
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void volar(int distancia){
		disminuirEnergia(distancia - 10);
	}
	
	public void comer(Alimento comida) {
		aumentarEnergia(comida.darNumeroDeAporteEnergetico());
	}
	
	public void comerGramos(int gramosAComer) {
		aumentarEnergia(4 * gramosAComer);
	}
	
	private void aumentarEnergia(double energia) {
		double nuevaEnergia = this.energia + energia;
		setEnergia(nuevaEnergia);
	}
	
	private void disminuirEnergia(double energia) {
		double nuevaEnergia = this.energia - energia;
		
		if(nuevaEnergia < 0)
			setEnergia(0);
		else
			setEnergia(nuevaEnergia);
	}
	
	public boolean hayhambre(){
		
		if( satisfaccion.noEstaActivo() && digestion.noEstaActivo() )
			return true;
		else
			return false;
		
	}
	
}