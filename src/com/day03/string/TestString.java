package com.day03.string;
/**
 * String的底层是char类型的数组
 * String类中所有的方法，都不改变String原对象本身
 *
 */
public class TestString {
	public static void main(String[] args) {
		String str1="张三";
		String str2="zhangsan";
		//字符串中包含的字符个数，与字节无关，与中英文无关
		System.out.println(str1.length()+" "+str2.length() );
		
		//截取
		String str3="abc.jpg";
		System.out.println(str3.substring(str3.lastIndexOf(".")+1));
		String str4="qwertt";
		System.out.println(str4.substring(2, 4));
		
		
		String str5="a2356a";
		System.out.println(str5.charAt(0));
		
		System.out.println(str5.indexOf("2"));
		System.out.println(str5.lastIndexOf("a"));
		
		//1.逐个比较每个字符，直到比较出不一样的字符，返回两个字符的Unicode码的差值 abc abd
		//2.如果逐个比较，把其中一方的全部字符都比较完了也没有得到结果，则返回两个字符串的长度差 abs abscd
		String str6="abc";
		String str7="abd";
		System.out.println(str6.compareTo(str7));
	
	}
}
