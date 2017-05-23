package com.itheima.test5;

public abstract class Animal {
	private String name;
	private double weight;

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public abstract void eat();

	// get set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
