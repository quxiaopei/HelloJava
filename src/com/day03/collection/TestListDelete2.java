package com.day03.collection;

import java.util.ArrayList;
/**
 * ArrayListɾ��
 * 1.�����±���ɾ��
 * 2.����Ԫ����ɾ��������equals������ɾ��
 *
 */
public class TestListDelete2 {
	public static void main(String[] args) {
		ArrayList  list=new ArrayList();
		Person p=new Person(12, "����");
		Person p2=new Person(13, "����");
		Person p3=new Person(14, "����");
		Person p4=new Person(15, "����");
		list.add(p);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		Person p5=new Person(12, "����");
		list.add(p5);
		System.out.println(list);
		list.remove(p5);
		System.out.println(list);
		
	}
}
