package com.day02;
/**
 * ʵ����
 * Person������������������Ĺ�ͬ����
 * �ȶ����࣬����������������һ��һ��������ˣ�
 * ���Ե�ֵ����ĳ���������ġ�
 * һ�㷽��Ҳ�����ھ������ġ�
 * 
 * ���췽����
 * 1.���һ������û��д�κι��췽������Ĭ�����޲εĹ��췽����
 * 2.����ṩ���������췽������Ĭ�ϵ��޲ι��첻���ṩ
 * ���췽����һ������ķ���
 * 1.д���ϣ����ƺ���������һ�£�û�з���ֵ���͡�
 * 2.�����ϣ����ڴ�������
 * 
 * ���أ�
 * 1.��������ͬ������������ͬ����Ϊ����������
 * 2.����������ͬ������������ͬ�����Ͳ�ͬ��˳��ͬ
 * 
 * ���췽�����໥�������⣺Ҫ������ѭ��
 * this��ʾ�������
 * 1.this����������ʾ�Ա����������췽���ĵ���
 * 2.this.�����ñ��������
 * ���԰�סctrl����ת
 */
public class Person {

String name;
int age;
private String sex;
public Person() {
	System.out.println("�����޲ι��췽��");
	}
public Person(String sex){
	this.sex=sex;
}
public Person(String name,String sex){
	this(sex);
	this.name=name;
}
public void speak(){
	System.out.println("��˵��");
}
public void walk(){
	System.out.println("����·");
}
public void desc(){
	System.out.println("�ҽ�"+name+"����"+age+"�Ա���"+sex);
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
}