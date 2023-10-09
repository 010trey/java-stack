package com.teje.ninja;

public class NINJA {
		//MeMBER VARIABLES
		
		private int health;
		private String name;
		private int power;
		private weapon weapon; 
		private static int numberOfNinjas;
		
		
		
//		
//		//EMPTY CONSTRUCTRO
//		public NINJA() {
//			this.name = "Anonymous";
//			this.health = 80;
//			this.power = 30;
//		
//		}
//		
//		
		
		

        public NINJA(int health, String name, int power, weapon weapon) {
			this.health = health;
			this.name = name;
			this.power = power;
			this.weapon = weapon;
		}
        
        
        







		public weapon getWeapon() {
			return weapon;
		}





		public void setWeapon(weapon weapon) {
			this.weapon = weapon;
		}





		//OVERLOADING CONSTRUCTOR 
		public NINJA(int health, String name, int power) {
			this.health = health;
			this.name = name;
			this.power = power;
		}
		
		
		//METHODS
		public void displayStates() {
			System.out.println("Name: " +this.getName());
			System.out.println("Health: " +this.getHealth());
		}
		
		
		public void attack(NINJA target) {
			target.setHealth(target.getHealth() - this.weapon.getDamage());
			System.out.println(this.getName() + "attacks" + target.getName() + "with" + this.weapon.getName() + "for" + this.getPower() + ",and now... \n"
					+ target.getName() + "has" + target.getHealth() + "hp left");
		}





		//GETTERS & SETTERS
		
		public int getHealth() {
			return health;
		}
		
		
		public void setHealth(int health) {
			this.health = health;
		}
		
		
		public String getName() {
			return name;
		}
		
		
		public void setName(String name) {
			this.name = name;
		}
		
		
		public int getPower() {
			return power;
		}
		
		
		public void setPower(int power) {
			this.power = power;
		}
		
		
		
		public static int getNumberOfNinjas() {
			return numberOfNinjas;
		}
		
		
		
		public static void setNumberOfNinjas(int numberOfNinjas) {
			NINJA.numberOfNinjas = numberOfNinjas;
		}
		
		
		


}
