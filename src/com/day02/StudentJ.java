package com.day02;

public class StudentJ extends PersonJ{
	private int stuNo;
	public StudentJ(){
		System.out.println("StudentJ");
	}
	
	public StudentJ(int stuNo,int age,String name) {
//		1.ʹ��super�ؼ��֣�superָ�������
//		2.ʹ��super.���ø��๹�췽��
//		3.ʹ��super�������ø���Ĺ��췽��
//		super.setAge(age);
//		super.setName(name);
		super(name, age);
		this.stuNo = stuNo;
	}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
/**
 * ��д
 * 1.�����ڸ�����֮��
 * 2.ͬ��ͬ��ͬ����
 */
	@Override
	public void desc() {
		System.out.println(super.getAge()+super.getName()+this.stuNo);
	}

}
