package com.day02;
/**
 * ������
 *
 */
public class TestPerson {
	public static void main(String[] args) {
		//new +���췽��������������
		Person person=new Person();
		person.name="zhangsan";
		person.age=20;
		person.setSex("��");
		person.walk();
		person.speak();
		person.desc();
	}
}
