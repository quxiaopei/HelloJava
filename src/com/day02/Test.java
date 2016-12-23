package com.day02;

public class Test {
	
	public static void main(String[] args) {
		Dog dog=new Dog("xueer", 6);
		PersonForDog p=new PersonForDog("aobama",13,dog);
		System.out.println(p.dog.name);
	}
}
