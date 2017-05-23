package com.itheima.test5_1;

class Manager extends Employee {
	private double bonus;

	public Manager() {
		System.out.println("Manager()");
	}

	public Manager(double bonus) {
		super();
		this.bonus = bonus;
		System.out.println("Manager(double bonus)");
	}

	public Manager(String name, String jobNumber, double salary, double bonus) {
		super(name, jobNumber, salary);
		this.bonus = bonus;
		System.out.println("Manager(String name, String jobNumber, double salary, double bonus)");
	}

	@Override
	public void work() {
		System.out.println(this.getName() + "--" + this.getJobNumber() + "--" + this.getSalary() + "--" + bonus);
	}

	// get set
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}
