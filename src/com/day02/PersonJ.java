package com.day02;
/**
 * ���������������
 * �����󡿡���װ���̳С���̬
 * ��װ��һ�ְ�ȫ�淶
 * �̳У���Ϊ�˴���ĸ�����
 * 1.ʹ��extends�ؼ���
 * 2.a�̳���bʱ��a��Ϊ������������࣬b��Ϊ���ࡢ���ࡢ���ࣨsuperclass��
 * 3.ʲôʱ���ܽ������ӹ�ϵ�����ϴ���ԭ��A is a B��
 * 4.Java�еļ̳��ǵ����̳У���һ������ֻ����һ�����ࡣ
 * ����Щ���ݱ��̳��ˣ�
 * 1.һ�㷽�����̳�
 * 2.���췽�������̳�
 * 
 * �̳к����๹�췽��Ĭ�ϻ���ø�����޲ι��췽������super();
 * �������ظ�����������˸�����вι��췽�� ��д���޲λᱨ��
 * 
 * ��д�Ƕ�̬��ǰ��
 * 
 * everthing is object ������Զ��� ʲô���Ƕ���
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
