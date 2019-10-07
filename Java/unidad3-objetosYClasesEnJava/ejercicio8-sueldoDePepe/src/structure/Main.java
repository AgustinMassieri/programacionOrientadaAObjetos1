package structure;

import domain.*;

public class Main {
	public static void main(String[] args) {
		Presentismo presentismoNormal = new Presentismo();
		Presentismo presentismoNulo = new PresentismoNulo();
		
		Resultados bonoResultadosFijo = new Fijo();
		Resultados bonoResultadosPorcentual = new Porcentual();
		Resultados bonoResultadosNulo = new ResultadosNulo();
		
		Categoria catGerente = new Gerente();
		Categoria catCadete = new Cadete();
		
		Empleado pepe = new Empleado(catCadete, presentismoNormal ,bonoResultadosFijo);

		System.out.println(pepe);
		pepe.incrementarFaltas();
		pepe.incrementarFaltas();
		
		pepe.setBonoPorPresentismo(presentismoNulo);
		pepe.setBonoPorResultados(bonoResultadosNulo);

		System.out.println(pepe);

		
		
	}
}