package com.teje.ninja;

public class weapon {
	//Member Varibales
	
	private String name;
	private Integer damage;
	
	
	
	
	public weapon(String name, Integer damage) {
		super();
		this.name = name;
		this.damage = damage;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getDamage() {
		return damage;
	}
	
	public void setDamage(Integer damage) {
		this.damage = damage;
	}
	

}
