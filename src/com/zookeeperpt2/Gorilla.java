package com.zookeeperpt2;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("Gorilla throws something");
		this.energyLevel-=5;
	}
	public void eatBanana() {
		System.out.println("Gorilla is satisfied with their banana");
		this.energyLevel+=10;
	}
	public void climb() {
		System.out.println("Gorilla has climbed a tree");
		this.energyLevel-=10;
	}
}
