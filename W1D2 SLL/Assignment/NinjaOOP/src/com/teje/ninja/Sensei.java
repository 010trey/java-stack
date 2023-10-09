package com.teje.ninja;

public class Sensei extends NINJA{
	
	
	private Boolean isInvisble;
	private Integer damageMuttiplier;
	private String typeOfMartialArts;
	
	
	
	
	
	public Sensei(Boolean isInvisble, Integer damageMuttiplier, String typeOfMartialArts, int health, String name, int power, weapon weapon) {
		super(health, name, power,weapon);
		this.isInvisble = isInvisble;
		this.damageMuttiplier = damageMuttiplier;
		this.typeOfMartialArts = typeOfMartialArts;
	}



	public Boolean getIsInvisble() {
		return isInvisble;
	}
	public void setIsInvisble(Boolean isInvisble) {
		this.isInvisble = isInvisble; 
	}
	public Integer getDamageMuttiplier() {
		return damageMuttiplier;
	}
	public void setDamageMuttiplier(Integer damageMuttiplier) {
		this.damageMuttiplier = damageMuttiplier;
	}
	public String getTypeOfMartialArts() {
		return typeOfMartialArts;
	}
	public void setTypeOfMartialArts(String typeOfMartialArts) {
		this.typeOfMartialArts = typeOfMartialArts;
	}
	
	
	

}
