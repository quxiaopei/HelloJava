package com.day01;

import java.util.Scanner;

/**
 * 完成从控制台的录入工作
 * Scanner：扫描器
 * ctrl+Shift+O 包的引入和删除,自动匹配包
 * java.lang包中的类可以直接使用。
 * 其他包中的类，需要先引入，再使用。
 */
public class TestScanner {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("请输入字符串：");
	String str=scan.next();
	System.out.println("您输入的字符串是："+str);
}
}
