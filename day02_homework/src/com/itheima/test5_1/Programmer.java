package com.itheima.test5_1;

class Programmer extends Employee {

	public Programmer() {
		System.out.println("Programmer()");
	}

	public Programmer(String name, String jobNumber, double salary) {
		super(name, jobNumber, salary);
		System.out.println("Programmer(String name, String jobNumber, double salary)");
	}

	@Override
	public void work() {
		System.out.println(this.getName() + "--" + this.getJobNumber() + "--" + this.getSalary());
	}

}
