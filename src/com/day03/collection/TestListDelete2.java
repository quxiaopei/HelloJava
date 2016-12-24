package com.day03.collection;

import java.util.ArrayList;
/**
 * ArrayList删除
 * 1.根据下标来删除
 * 2.根据元素来删除，根据equals方法来删除
 *
 */
public class TestListDelete2 {
	public static void main(String[] args) {
		ArrayList  list=new ArrayList();
		Person p=new Person(12, "张三");
		Person p2=new Person(13, "李四");
		Person p3=new Person(14, "王五");
		Person p4=new Person(15, "柳柳");
		list.add(p);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		Person p5=new Person(12, "张三");
		list.add(p5);
		System.out.println(list);
		list.remove(p5);
		System.out.println(list);
		
	}
}
