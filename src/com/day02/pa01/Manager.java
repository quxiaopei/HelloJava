package com.day02.pa01;

public class Manager extends Emp{
	private String position;
	private double bounds;
	public Manager(String name, int id, double sal, String position, double bounds) {
		super(name, id, sal);
		this.position = position;
		this.bounds = bounds;
	}
	public Manager() {
		super();
	}
	public Manager(String name, int id, double sal) {
		super(name, id, sal);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Manager [position=" + position + ", bounds=" + bounds + ", toString()=" + super.toString() + "]";
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getBounds() {
		return bounds;
	}
	public void setBounds(double bounds) {
		this.bounds = bounds;
	}
	@Override
	public double getTotalSal() {
		return super.getTotalSal()*(1+this.bounds);
	}
	@Override
	public double getTotalSalabs() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
