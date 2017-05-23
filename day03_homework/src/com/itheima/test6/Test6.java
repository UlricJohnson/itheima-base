package com.itheima.test6;

public class Test6 {

	public static void main(String[] args) {
		Person p1 = new BasisClassTeacher("张三老师", 35);
		Person p2 = new EmploymentObtainClassTeacher("李四老师", 45);
		Person p3 = new BasisClassStudent("王五学生", 20);
		Person p4 = new EmploymentObtainClassStudent("马六学生", 25);

		usePerson(p1);
		usePerson(p2);
		usePerson(p3);
		usePerson(p4);
	}

	public static void usePerson(Person p) {
		if (p instanceof Teacher) {
			// if (p instanceof BasisClassTeacher) {
			//
			// } else if (p instanceof EmploymentObtainClassTeacher) {
			//
			// }
			((Teacher) p).teach();
		} else if (p instanceof Student) {
			// if (p instanceof BasisClassStudent) {
			//
			// } else if (p instanceof EmploymentObtainClassStudent) {
			//
			// }
			((Student) p).study();
		}
	}

}
