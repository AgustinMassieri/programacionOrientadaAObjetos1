package domain;

public class Canastita{
	int cantidadDeManzanas;
	static final int caloriaDeManzana = 2;
	
	public Canastita(){
		cantidadDeManzanas = 0;
	}
	
	public void agregarManzanas(int cantidadDeManzanas){
		this.cantidadDeManzanas += cantidadDeManzanas;
	}
	
	public int sacarManzanaYdarAporteEnergetico(int cantidadDeManzanas) {
		int cantidadFinalDeManzanas = this.cantidadDeManzanas - cantidadDeManzanas;
		int aporteEnergetico = 0;
		
		if(cantidadFinalDeManzanas < 0) {
			aporteEnergetico = this.cantidadDeManzanas * caloriaDeManzana;
			this.cantidadDeManzanas = 0;
		}
		else
		{
			aporteEnergetico = cantidadDeManzanas * caloriaDeManzana;
			this.cantidadDeManzanas = cantidadFinalDeManzanas;
		}
		
		return aporteEnergetico;
	}

}