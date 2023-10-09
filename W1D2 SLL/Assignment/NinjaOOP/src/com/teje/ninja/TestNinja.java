package com.teje.ninja;

public class TestNinja {

	public static void main(String[] args) {
		
		//INSTANTIATE NINJA CLASS
		weapon weapon1 = new weapon("Katana", 65);
		
//		NINJA ninja1 = new NINJA();	
		
		NINJA ninja2 = new NINJA( 100,"Leonardo", 50, weapon1);
		
//		ninja1.displayStates();
//		
//		ninja2.attack(ninja1);
//		
//		ninja1.displayStates();
		
		Sensei oogway = new Sensei(true, 3,"UNKNOWN", 200, "Oogway", 66, weapon1);
		
//		System.out.println(oogway.getName());
//		
		oogway.displayStates();
		ninja2.attack(oogway);
		oogway.displayStates();
	
	}

}
