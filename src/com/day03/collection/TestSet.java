package com.day03.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Collection
 * List set
 * List��ArrayList Vector LinkedList
 * List:1.�������ݵĴ洢˳���ȡ��˳��һ�£�2.Ԫ�ؿ����ظ�
 * Set��HashSet TreeSet
 * Set��1.�������ݵĴ洢˳���ȡ��˳��һ�£� 2.Ԫ�ز����ظ� 
 *
 */
public class TestSet {
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
	    set.add("one");
	    set.add("one");
	    set.add("one");
	    set.add("two");
	    set.add("two");
	    set.add("one");
	    set.add("three");
	    set.add("two");
	    Iterator<String> it=set.iterator();
	    while(it.hasNext()){
	    	System.out.println(it.next());
	    }
	}
}
