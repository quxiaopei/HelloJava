package com.day03.collection;

import java.util.ArrayList;
/**
 *jdk1.5后引入泛型
 *1.避免强制类型转换
 *2.避免脏数据 
 *
 */
public class TestArrayListQuery {
	public static void main(String[] args) {
		ArrayList  list=new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		for(int i=0;i<list.size();i++){
			String s=(String)list.get(i);
			System.out.println(s.charAt(0));
		}
		
		ArrayList<String> list2=new ArrayList<String>();	
		list2.add("ze");
		list2.add("ze");
		list2.add("ze");
		for(int i=0;i<list2.size();i++){
			String s=list2.get(i);
			System.out.println(s.charAt(0));
		}
	}
}
