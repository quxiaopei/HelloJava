package com.day02.pa01;
/**
 * 1.���һ������ �г��󷽷�����������Ϊ������
 * 2.���������Ϊ����ģ��������д�������г��󷽷�
 * 
 * ���󷽷���
 * 1.��֪�������дʲô����д�ɳ���ģ����������Ϊ������������д��������г��󷽷�
 * 2.���󷽷���һ�ֱ�׼��ǿ��Ҫ��ǳ������������д
 * 
 * �����ࣺ
 * 1.�������п����зǳ��󷽷���Ҳ�����г��󷽷���
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
