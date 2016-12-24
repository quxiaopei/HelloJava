package com.day03.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map:存储键值对信息
 * HashMap Hashtable TreeMap
 *
 */
public class TestMap {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("zhangsankey", "value");
		Set<String> set=map.keySet();
		//得到所有的key组成的set集合
		Iterator<String> it=set.iterator();
		while(it.hasNext()){
			String key=it.next();
			System.out.println(map.get(key));
		}
	}
}
