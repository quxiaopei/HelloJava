package com.day02;

public class PersonForChild {
  String name;
  int age;
  PersonForChild child;
  public PersonForChild(){
	  
  }
  public PersonForChild(String name,int age){
	  this.name=name;
	  this.age=age;
  }
  public PersonForChild(String name,int age,PersonForChild child){
	  this.name=name;
	  this.age=age;
	  this.child=child;
  }
}
