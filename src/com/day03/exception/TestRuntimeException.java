package com.day03.exception;
/**
 * ��һ������Ϊnullʱ��ʹ�ö��������øö�������Ի򷽷�����ᱨ��NullPointException
 * 
 * Throwable�����е��쳣���ǿ����׳���
 * 
 * ����ʱ�쳣��
 * �������е�ʱ��ΰ��ᱨ�������쳣
 * ������ʱ�쳣�����ʱ�쳣����
 *
 */
public class TestRuntimeException {
public static void main(String[] args) {
/*	String s=null;
	//�������쳣��������һ��NullPointException�Ķ��󣬲����׸�jvm��jvm��������ֹ
	char c=s.charAt(0);*/
	/*String s2="qbd";
	Integer.parseInt(s2);*/
	int[] array={1,2,3};
int i=array[3];
     System.out.println(array[5]);
}
}
