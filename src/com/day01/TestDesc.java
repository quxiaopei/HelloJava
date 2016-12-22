package com.day01;

import java.util.Scanner;

/**
 *自我介绍 
 *
 */
public class TestDesc {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入您的姓名：");
		String name=scan.next();
		System.out.println("请输入您的年龄：");
		int age=scan.nextInt();
//		字符串和整数拼接，结果是字符串
		System.out.println("您的姓名是："+name+"您的年龄是："+age);
	}
}
