package com.day02;

public class Test2 {
	public static void main(String[] args) {
		PersonForChild child=new PersonForChild("haizie",18);
		PersonForChild father=new PersonForChild("father",55,child);
		System.out.println(child.name);
		System.out.println(father.child.name);
	}
}
