package com.day02.pa01;
/**
 * 1.如果一个类中 有抽象方法，则该类必须为抽象类
 * 2.如果不声明为抽象的，则必须重写父类所有抽象方法
 * 
 * 抽象方法：
 * 1.不知道具体该写什么，就写成抽象的，如果不声明为抽象的则必须重写父类的所有抽象方法
 * 2.抽象方法是一种标准，强制要求非抽象子类必须重写
 * 
 * 抽象类：
 * 1.抽象类中可以有非抽象方法，也可以有抽象方法。
 */
public abstract class Emp {
private String name;
private int id;
private double sal;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Emp(String name, int id, double sal) {
	super();
	this.name = name;
	this.id = id;
	this.sal = sal;
}
public Emp() {
	super();
}
@Override
public String toString() {
	return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + "]";
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public double getTotalSal(){
	double result = 0;
	result=this.sal*12;
	return result;
}
 public abstract double getTotalSalabs();
}
