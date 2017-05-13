package com.itheima.test05;

public class Teacher {
	private String name;
	private int age;
	private String content;

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age, String content) {
		this.name = name;
		this.age = age;
		this.content = content;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void eat() {
		System.out.println("年龄为" + age + "的" + name + "老师正在吃饭...");
	}

	public void teach() {
		System.out.println("年龄为" + age + "的" + name + "老师正在亢奋的讲着" + content + "的知识.....");
	}

}
