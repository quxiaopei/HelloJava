package com.day03.collection;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		//1.����ArrayList
		ArrayList  list=new ArrayList();
		//��ɾ�Ĳ�
		list.add("abc");//Object o=new String("abc");
		//�Զ�װ�� Integer i=new Integer(1); Object o=i;
		list.add(1);
		list.add("123");
		System.out.println(list);
		list.set(0, "one");
		System.out.println(list);
	}
}
