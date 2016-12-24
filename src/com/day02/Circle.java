package com.day02;
/**
 * 1.标志符的要求
 * 只能是数字，字符，下划线，美元符，数字不能开头
 * 支持中文，但是不建议（乱码）
 * 不能是java的关键字
 * 
 * 2.标识符的编程规范
 * 包名一般全小写，并且是域名倒着写+项目名+模块名的方式
 * 类名、接口名每个单词的首字母均大写，其他字母小写
 * 变量名、方法名第一个单词的首字母小写，其他单词的首字母大写
 * 常量：不可变的常量 所有字母大写，不同单词之间用_连接
 */
public class Circle {
	Point p;
	double r;
	public Circle(Point p, double r) {
		super();
		this.p = p;
		this.r = r;
	}
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Point getP() {
		return p;
	}
	public void setP(Point p) {
		this.p = p;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double zhouchang(){
		return 2*Math.PI*this.r;
	}
	public double mianji(){
		return Math.PI*this.r*this.r;
	}
}
