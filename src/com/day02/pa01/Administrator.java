package com.day02.pa01;

public class Administrator extends Emp{
 private String car;
 public Administrator() {
	 super();
}
public Administrator(String name, int id, double sal, String car) {
	super(name, id, sal);
	this.car = car;
}
@Override
public String toString() {
	return "Administrator [car=" + car +
			super.getName()+super.getId()+super.getSal()
			+"]"+"/n"+super.toString();
}
public String getCar() {
	return car;
}
public void setCar(String car) {
	this.car = car;
}
@Override
public double getTotalSal() {
	
	return super.getTotalSal();
}
@Override
public double getTotalSalabs() {
	// TODO Auto-generated method stub
	return 0;
}
}
