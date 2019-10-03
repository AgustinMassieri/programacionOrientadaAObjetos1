package domain;

import java.util.Arrays;

public class Canasta{
	
	private final int espacio;
	private int cantidadDeFrutas = 0;
	Fruta [] frutas;

	@Override
	public String toString() {
		return "Canasta [espacio=" + espacio + ", cantidadDeFrutas=" + cantidadDeFrutas + ", frutas="
				+ Arrays.toString(frutas) + "]";
	}

	public Canasta(){
		espacio = 10;
		frutas = new Fruta[espacio];
	}
	
	public Canasta(int espacio){
		this.espacio = espacio;
		frutas = new Fruta[espacio];
	}
	
	public int getCantidadDeFrutas() {
		return cantidadDeFrutas;
	}
	
	public void agregarFruta(Fruta fruta){
		
		if(cantidadDeFrutas < espacio){
			frutas[cantidadDeFrutas] = fruta;
			cantidadDeFrutas++;
		}
		
	}
	
	public Fruta sacarYDevolverUltimaFruta(){
		Fruta fruta = null;
		
		if(cantidadDeFrutas != 0){
			fruta = frutas[cantidadDeFrutas-1];
			frutas[cantidadDeFrutas-1] = null;
			cantidadDeFrutas--;
		}
		
		return fruta;
	}

}