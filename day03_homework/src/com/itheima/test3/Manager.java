package com.itheima.test3;

public class Manager extends Employee {
	private double bonus;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, String jobNumber, double salary) {
		super(name, jobNumber, salary);
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, String jobNumber, double salary, double bonus) {
		super(name, jobNumber, salary);
		this.bonus = bonus;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("经理--姓名：" + getName() + ", 工号：" + getJobNumber() + ", 工资：" + getSalary() + ", 奖金：" + bonus);
	}

	// get set
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}
