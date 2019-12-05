package domain;

public class Pi {
	private static Pi instance = null;
	private double piValue;

	public static Pi getInstance(){
		if(instance == null) {
			instance = new Pi(Math.PI);
		}
		
		return instance;
	}
	
	private Pi(double piValue) {
		this.piValue = piValue;
	}
	
	//Lo agregamos por si queremos modificar su valor;
	public void setPiValue(double piValue) {
		this.piValue = piValue;
	}
	
	public double getPiValue() {
		return piValue;
	}
	
}
