package com.day03.collection;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		//1.定义ArrayList
		ArrayList  list=new ArrayList();
		//增删改查
		list.add("abc");//Object o=new String("abc");
		//自动装箱 Integer i=new Integer(1); Object o=i;
		list.add(1);
		list.add("123");
		System.out.println(list);
		list.set(0, "one");
		System.out.println(list);
	}
}
