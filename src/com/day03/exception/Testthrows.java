package com.day03.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * �����ջ��Ϣ
 * 
 * try-catch-finally�������Ĵ����쳣�������Ĵ����쳣��
 * throws�������Ĵ����쳣����û�����������쳣�����ǽ��쳣�׸��˵����ߣ�ʹ��������ʱ�򣬲��ٱ��������
 */
public class Testthrows {
public static void main(String[] args) {
	m2();
}
public static void m2(){
	m1();
}
public static void m1(){
	try {
		FileInputStream f=new FileInputStream(new File("E:/123"));
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
}
}
