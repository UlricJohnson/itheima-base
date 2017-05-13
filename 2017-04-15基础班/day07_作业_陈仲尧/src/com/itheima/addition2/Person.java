package com.itheima.addition2;

public class Person {
	private String name;
	private int age;
	private String address;
	private String phone;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void drive(Car car) {
		System.out.println("年龄为" + age + "岁" + name + "，开着价值" + car.getPrice() + "万美元的" + car.getColor()
				+ car.getBrand() + "汽车追班长");
	}

}
