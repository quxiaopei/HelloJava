package com.day02;

public class StudentJ extends PersonJ{
	private int stuNo;
	public StudentJ(){
		System.out.println("StudentJ");
	}
	
	public StudentJ(int stuNo,int age,String name) {
//		1.使用super关键字，super指父类对象
//		2.使用super.调用父类构造方法
//		3.使用super（）调用父类的构造方法
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
 * 重写
 * 1.发生在父子类之间
 * 2.同名同参同返回
 */
	@Override
	public void desc() {
		System.out.println(super.getAge()+super.getName()+this.stuNo);
	}

}
