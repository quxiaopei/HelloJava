package com.day02;
/**
 * 测试类
 *
 */
public class TestPerson {
	public static void main(String[] args) {
		//new +构造方法（）创建对象
		Person person=new Person();
		person.name="zhangsan";
		person.age=20;
		person.setSex("男");
		person.walk();
		person.speak();
		person.desc();
	}
}
