package structure;

import domain.*;

public class Main {

	public static void main(String[] args) {
		Correcaminos correCaminosUno = new Correcaminos(20, 0, 500);
		Coyote coyoteUno = new Coyote(100, 2, 100);
		
		System.out.println(correCaminosUno);
		System.out.println(coyoteUno);
		System.out.println(coyoteUno.correrAlCorrecaminos(correCaminosUno));
	}
	
}
