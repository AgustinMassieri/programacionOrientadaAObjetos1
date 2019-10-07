package domain;

public class Gerente extends Categoria {
	
	@Override
	public String toString() {
		return "Gerente";
	}

	public double getNeto() {
		return 1000;
	}
	
}
