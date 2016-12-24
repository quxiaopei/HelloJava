package com.day03.collection;

import java.util.ArrayList;
/**
 * ArrayList删除
 * 1.根据下标来删除
 * 2.根据元素来删除，根据equals方法来删除
 *
 */
public class TestListDelete {
	public static void main(String[] args) {
		ArrayList  list=new ArrayList();
		list.add("abc");//Object o=new String("abc");
		list.add(1);
		list.add("123");
		list.add(new String("String"));
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		//注意自动装箱的删除
		list.remove(new Integer(1));
		System.out.println(list);
		//根据equals方法来删除
		list.remove(new String("String"));
		System.out.println(list);
	}
}
