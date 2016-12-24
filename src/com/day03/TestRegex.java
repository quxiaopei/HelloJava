package com.day03;

import java.util.Arrays;

/**
 * 正则表达式：一般用于格式的验证
 * 
 * 注释：
 * 1.单行注释
 * 2.多行注释
 * 3.文档注释 （导到了api中）项目=》右键=》expot=》javadoc（其中javacommand为
 * D:\Program Files\Java\jdk1.8.0_111\bin\javadoc.exe，即javadoc命令的位置）
 *  
 * 正则表达式相关的类：java.util.regex.Pattern
 */
public class TestRegex {
public static void main(String[] args) {
	String str1="abcds123etew12";
	String[] strArr=str1.split("\\d{2,3}");
	System.out.println(Arrays.toString(strArr));
	//1.验证用户名，要求：数字、字母下划线组成，长度为8-16位
	String name="123asf";
	if(name.matches("[a-zA-Z]{8,16}")){
		System.out.println("注册成功");
		
	}else{
		System.out.println("注册失败");
	}
	//2.手机号验证：以1开头，后面10位数字
	String phoneNum="11234567891";
	if(phoneNum.matches("[1]{1}[0-9]{10}")){
		System.out.println("您输入的电话号码合法");
	}else{
		System.out.println("您输入的电话号码不合法");
	}
	//3.验证邮箱 要求：数字字母下划线出现3次以上@符号出现一次，数字字母出现2次以上，出现一次com或cn
	
	String email="qxpat@163.com";
	if(email.matches("\\w{3,}[a-zA-Z0-9]{2,}\\.{1}(com|cn)")){
		System.out.println("邮箱合法");
	}else{
		System.out.println("邮箱不合法");
	}
	
}
}
