package com.itheima.addition2;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("宝马", "白色", 6);
		car.run();

		Person person = new Person("凤姐", 23);
		person.setAddress("南方");
		person.setPhone("13866666666");
		person.drive(car);
	}

}
