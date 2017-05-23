package com.itheima.test5;

public class Person {
	private String name;
	private String sex;
	private String age;
	private String qqString;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String sex, String age, String qqString) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.qqString = qqString;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getQqString() {
		return qqString;
	}

	public void setQqString(String qqString) {
		this.qqString = qqString;
	}

}
