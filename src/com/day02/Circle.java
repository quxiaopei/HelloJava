package com.day02;
/**
 * 1.��־����Ҫ��
 * ֻ�������֣��ַ����»��ߣ���Ԫ�������ֲ��ܿ�ͷ
 * ֧�����ģ����ǲ����飨���룩
 * ������java�Ĺؼ���
 * 
 * 2.��ʶ���ı�̹淶
 * ����һ��ȫСд����������������д+��Ŀ��+ģ�����ķ�ʽ
 * �������ӿ���ÿ�����ʵ�����ĸ����д��������ĸСд
 * ����������������һ�����ʵ�����ĸСд���������ʵ�����ĸ��д
 * ���������ɱ�ĳ��� ������ĸ��д����ͬ����֮����_����
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
