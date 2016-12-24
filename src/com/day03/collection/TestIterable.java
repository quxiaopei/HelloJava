package com.day03.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *Iterable���ɵ�����
 *Iterator��������
 *
 * ������ ɨ���� �ļ������� �ļ����ƹ����� �Ƚ��� ������ ��ʱ��
 *
 */
public class TestIterable {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
	   list.add("one");	
	   list.add("one2");	
	   list.add("one3");
	   //����û�д�����
	   Iterator<String> it=list.iterator();
	   while(it.hasNext()){
		   System.out.println(it.next());
	   }
	   //foreach ѭ�����ڲ���Iterater
	   for (String str : list) {
		System.out.println(str);
	}
	}
}
