package com.day03.string;
/**
 * String�ĵײ���char���͵�����
 * String�������еķ����������ı�Stringԭ������
 *
 */
public class TestString {
	public static void main(String[] args) {
		String str1="����";
		String str2="zhangsan";
		//�ַ����а������ַ����������ֽ��޹أ�����Ӣ���޹�
		System.out.println(str1.length()+" "+str2.length() );
		
		//��ȡ
		String str3="abc.jpg";
		System.out.println(str3.substring(str3.lastIndexOf(".")+1));
		String str4="qwertt";
		System.out.println(str4.substring(2, 4));
		
		
		String str5="a2356a";
		System.out.println(str5.charAt(0));
		
		System.out.println(str5.indexOf("2"));
		System.out.println(str5.lastIndexOf("a"));
		
		//1.����Ƚ�ÿ���ַ���ֱ���Ƚϳ���һ�����ַ������������ַ���Unicode��Ĳ�ֵ abc abd
		//2.�������Ƚϣ�������һ����ȫ���ַ����Ƚ�����Ҳû�еõ�������򷵻������ַ����ĳ��Ȳ� abs abscd
		String str6="abc";
		String str7="abd";
		System.out.println(str6.compareTo(str7));
	
	}
}
