package domain;

import java.util.Arrays;

public class Casa extends Lugar{
	Material material;
	private int cantidadDeMaterial;
	private int capacidad;
	private Chancho [] chanchosEnLaCasa;
	
	@Override
	public String toString() {
		return "Casa [material=" + material + ", cantidadDeMaterial=" + cantidadDeMaterial + ", capacidad=" + capacidad
				+ "]";
	}

	public Casa(int distancia){
		super(distancia);
		material = new Paja();
		capacidad = 5;
		chanchosEnLaCasa = new Chancho[capacidad];
		cantidadDeMaterial = 100;
	}
	
	public Casa(int distancia, Material material, int cantidadDeMaterial){
		super(distancia);
		this.material = material;
		capacidad = 5;
		chanchosEnLaCasa = new Chancho[capacidad];
		this.cantidadDeMaterial = cantidadDeMaterial;	
	}
	
	public Casa(int distancia, Material material, int cantidadDeMaterial, int capacidad){
		super(distancia);
		this.material = material;
		this.capacidad = capacidad;
		chanchosEnLaCasa = new Chancho[capacidad];
		this.cantidadDeMaterial = cantidadDeMaterial;	
	}
	
	public int getResistencia(){
		int resistenciaDelMaterial = material.getResistencia();
		int resistenciaDeLaCasa = resistenciaDelMaterial * cantidadDeMaterial;
		return resistenciaDeLaCasa; 
	}
	
	public int getPeso() {
		int pesoTotal = 0;
		int indice = 0;
		
		while(indice < capacidad) {
			
			if(chanchosEnLaCasa[indice] != null) {
				pesoTotal += chanchosEnLaCasa[indice].getPeso();
			}
				
			indice++;
		}
		
		return pesoTotal;
	}
	
	public void ingresarChancho(Chancho chancho) { 
		int indice = 0;
		
		while(indice < capacidad && chanchosEnLaCasa[indice] != null) {
			indice++;
		}
		
		if(chanchosEnLaCasa[indice] == null)
			chanchosEnLaCasa[indice] = chancho;
		
	}
	
	public void sacarChancho(Chancho chancho) {
		int indice = 0;
		
		while(indice < capacidad && !chancho.equals(chanchosEnLaCasa[indice]) ) {
			indice++;
		}
		
		if( chancho.equals(chanchosEnLaCasa[indice]) )
			chanchosEnLaCasa[indice] = null;
		
	}
	
	
	
	
	
}