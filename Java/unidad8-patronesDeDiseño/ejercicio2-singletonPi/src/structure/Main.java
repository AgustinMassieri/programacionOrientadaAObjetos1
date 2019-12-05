package structure;

import domain.*;

public class Main {

	public static void main(String[] args) {
		Pi piObject = Pi.getInstance();
		
		System.out.println(piObject.getPiValue());
	}

}
