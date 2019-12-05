package structure;

import domain.*;

public class Main {

	public static void main(String[] args) {
		FormaDePago tarjeta = new Tarjeta();
		FormaDePago efectivo = new Efectivo();

		Cuenta cuentaDePrueba = new Cuenta(1000, efectivo);
		CalculadoraDeImporte calculadoraDePrueba = new CalculadoraDeLosMiercoles(cuentaDePrueba);
		cuentaDePrueba.setCalculadoraDeImporte(calculadoraDePrueba);
		
		System.out.println(cuentaDePrueba.calcularImporte());
	}

}
