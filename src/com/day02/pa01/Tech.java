package com.day02.pa01;

public class Tech extends Emp {
  private String team;
  private double comm;
public String getTeam() {
	return team;
}
public void setTeam(String team) {
	this.team = team;
}
public double getComm() {
	return comm;
}
public void setComm(double comm) {
	this.comm = comm;
}
public Tech() {
	super();
	// TODO Auto-generated constructor stub
}
public Tech(String name, int id, double sal, String team, double comm) {
	super(name, id, sal);
	this.team = team;
	this.comm = comm;
}
@Override
public String toString() {
	return "Tech [team=" + team + ", comm=" + comm + "]"+super.toString();
}
@Override
public double getTotalSal() {
	return super.getTotalSal()+this.comm;
}
@Override
public double getTotalSalabs() {
	// TODO Auto-generated method stub
	return 0;
}


}
