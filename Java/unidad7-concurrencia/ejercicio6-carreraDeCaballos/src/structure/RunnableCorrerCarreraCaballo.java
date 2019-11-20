package structure;

import domain.*;

public class RunnableCorrerCarreraCaballo implements Runnable {

	Caballo caballo;
	Carrera carrera;
	double distanciaARecorrer;
	
	public RunnableCorrerCarreraCaballo(Carrera carrera, Caballo caballo,double distanciaARecorrer) {
		this.carrera = carrera;
		this.caballo = caballo;
		this.distanciaARecorrer = distanciaARecorrer;
	}
	
	public void run() {
	
		double distanciaRecorrida = 0;
		double intervaloDeTiempo = 0.05; //en segundos
		long intervaloDeTiempoEnMiliSegundos = (long) (intervaloDeTiempo * 1000);
		
		try{
			while(distanciaRecorrida < distanciaARecorrer) {
				distanciaRecorrida += intervaloDeTiempo * caballo.getVelocidad();
				Thread.sleep(intervaloDeTiempoEnMiliSegundos);
			}
			carrera.agregarAListaDeLlegada(caballo);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
}