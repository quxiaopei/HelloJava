package com.day03.collection;

import java.util.ArrayList;
/**
 * ArrayListɾ��
 * 1.�����±���ɾ��
 * 2.����Ԫ����ɾ��������equals������ɾ��
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
		//ע���Զ�װ���ɾ��
		list.remove(new Integer(1));
		System.out.println(list);
		//����equals������ɾ��
		list.remove(new String("String"));
		System.out.println(list);
	}
}
