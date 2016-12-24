package com.day03.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * Collections：工具类，提供了一系列的操作集合的工具方法
 *
 */
public class TestCollections {
public static void main(String[] args) {
	//数组
    int[] arr={9,8,1,3,4,6,4};
    System.out.println(Arrays.toString(arr));
    Arrays.sort(arr);//还有其他的方法
    System.out.println(Arrays.toString(arr));
    //集合
    List<String> list=new ArrayList<String> ();
    list.add("four");
    list.add("two");
    list.add("three");
    
//    Collections.sort(list);
    
    for(String str:list){
    	System.out.println(str);
    }
    
    Collections.sort(list,new Comparator<String>(){

		@Override
		public int compare(String arg0, String arg1) {
			return 0;
		}
    	
    });
   
}}
