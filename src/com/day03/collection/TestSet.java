package com.day03.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Collection
 * List set
 * List：ArrayList Vector LinkedList
 * List:1.有序（数据的存储顺序和取出顺序一致）2.元素可以重复
 * Set：HashSet TreeSet
 * Set：1.无序（数据的存储顺序和取出顺序不一致） 2.元素不可重复 
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
