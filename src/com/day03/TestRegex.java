package com.day03;

import java.util.Arrays;

/**
 * ������ʽ��һ�����ڸ�ʽ����֤
 * 
 * ע�ͣ�
 * 1.����ע��
 * 2.����ע��
 * 3.�ĵ�ע�� ��������api�У���Ŀ=���Ҽ�=��expot=��javadoc������javacommandΪ
 * D:\Program Files\Java\jdk1.8.0_111\bin\javadoc.exe����javadoc�����λ�ã�
 *  
 * ������ʽ��ص��ࣺjava.util.regex.Pattern
 */
public class TestRegex {
public static void main(String[] args) {
	String str1="abcds123etew12";
	String[] strArr=str1.split("\\d{2,3}");
	System.out.println(Arrays.toString(strArr));
	//1.��֤�û�����Ҫ�����֡���ĸ�»�����ɣ�����Ϊ8-16λ
	String name="123asf";
	if(name.matches("[a-zA-Z]{8,16}")){
		System.out.println("ע��ɹ�");
		
	}else{
		System.out.println("ע��ʧ��");
	}
	//2.�ֻ�����֤����1��ͷ������10λ����
	String phoneNum="11234567891";
	if(phoneNum.matches("[1]{1}[0-9]{10}")){
		System.out.println("������ĵ绰����Ϸ�");
	}else{
		System.out.println("������ĵ绰���벻�Ϸ�");
	}
	//3.��֤���� Ҫ��������ĸ�»��߳���3������@���ų���һ�Σ�������ĸ����2�����ϣ�����һ��com��cn
	
	String email="qxpat@163.com";
	if(email.matches("\\w{3,}[a-zA-Z0-9]{2,}\\.{1}(com|cn)")){
		System.out.println("����Ϸ�");
	}else{
		System.out.println("���䲻�Ϸ�");
	}
	
}
}
