package com.day02;
/**
 * 面向对象三大特征
 * 【抽象】、封装、继承、多态
 * 封装是一种安全规范
 * 继承，是为了代码的复用性
 * 1.使用extends关键字
 * 2.a继承自b时，a称为子类或者派生类，b称为父类、超类、基类（superclass）
 * 3.什么时候能建立父子关系？里氏代换原则：A is a B；
 * 4.Java中的继承是单根继承，即一个子类只能有一个父类。
 * 有哪些内容被继承了？
 * 1.一般方法被继承
 * 2.构造方法不被继承
 * 
 * 继承后，子类构造方法默认会调用父类的无参构造方法，即super();
 * 但不可重复即如果调用了父类的有参构造方法 又写了无参会报错
 * 
 * 重写是多态的前提
 * 
 * everthing is object ：万物皆对象 什么都是东西
 */
public class PersonJ {
	private String name;
	private int age;
	public PersonJ(){
		super();
		System.out.println("PersonJ");
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
	public PersonJ(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void desc(){
		System.out.println(name+age);
	}
}
