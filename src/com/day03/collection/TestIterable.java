package com.day03.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *Iterable：可迭代的
 *Iterator：迭代器
 *
 * 迭代器 扫描器 文件过滤器 文件名称过滤器 比较器 拦截器 定时器
 *
 */
public class TestIterable {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
	   list.add("one");	
	   list.add("one2");	
	   list.add("one3");
	   //泛型没有传递性
	   Iterator<String> it=list.iterator();
	   while(it.hasNext()){
		   System.out.println(it.next());
	   }
	   //foreach 循环的内部是Iterater
	   for (String str : list) {
		System.out.println(str);
	}
	}
}
