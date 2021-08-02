package com.zookeeperpt2;

public class Bat extends Mammal{
	public Bat() {
		this.energyLevel=300;
	}
	
	public void fly() {
		System.out.println("sheeeeeeeeeesh");
		this.energyLevel-=50;
	}
	
	public void eatHumans() {
		this.energyLevel+=25;
	}
	
	public void attackTown() {
		System.out.println("ahhhhhhhhhhhhh");
		this.energyLevel-=100;
	}
}