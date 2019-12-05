package structure;

import domain.*;

public class Main {

	public static void main(String[] args) {
		Cuenta cuentaBancariaDePrueba = new Cuenta();
		System.out.println(cuentaBancariaDePrueba);
		
		cuentaBancariaDePrueba.depositarDinero(100);
		System.out.println(cuentaBancariaDePrueba);
		cuentaBancariaDePrueba.extraerDinero(150);
		System.out.println(cuentaBancariaDePrueba);
		cuentaBancariaDePrueba.extraerDinero(150);
		System.out.println(cuentaBancariaDePrueba);
		cuentaBancariaDePrueba.depositarDinero(200);
		System.out.println(cuentaBancariaDePrueba);
		cuentaBancariaDePrueba.cerrarCuenta();
		System.out.println(cuentaBancariaDePrueba);
		cuentaBancariaDePrueba.extraerDinero(150);
		System.out.println(cuentaBancariaDePrueba);
	}

}
