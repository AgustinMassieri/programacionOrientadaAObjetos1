package domain;

public class Ave {
	private int energia;
	private String nombre;
	private Lugar lugarActual;
	
	public Ave(String nombre, Lugar lugarDeInicio) {
		energia = 10;
		this.nombre = nombre;
		lugarActual = lugarDeInicio;
	}
	
	@Override
	public String toString(){
		return "Nombre: "+ nombre +" Energia: " + energia;
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
	
	public boolean sePuedeVolarEstaDistancia(int distancia) {
		boolean sePuedeVolar = false;

		if(energia > distancia + 10 && distancia > 0 )
			sePuedeVolar = true;
		
		return sePuedeVolar;
	}
	
	public boolean sePuedeVolarAlLugar(Lugar lugar) {
		boolean sePuedeVolar = false;
		int distancia = Lugar.obtenerDistanciaEntreLugares(lugarActual, lugar);

		if(sePuedeVolarEstaDistancia(distancia))
			sePuedeVolar = true;
		
		return sePuedeVolar;
	}
	
	public boolean volar(int distancia){
		boolean pudoVolar = false;
		
		if(energia > distancia + 10 && distancia != 0) {
			energia = energia - distancia - 10;
			pudoVolar = true;
		}
		
		return pudoVolar;
	}
	
	public boolean volarAUnLugar(Lugar lugarDeDestino){
		boolean pudoVolar = false;

		if( sePuedeVolarAlLugar(lugarDeDestino) ) {
			volar(Lugar.obtenerDistanciaEntreLugares(lugarActual, lugarDeDestino));
			lugarActual = lugarDeDestino;
			pudoVolar = true;
		}
		
		return pudoVolar;
	}
	
	public void comer(int gramosAComer) {
		energia += gramosAComer * 4;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
