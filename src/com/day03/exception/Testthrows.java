package com.day03.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 错误堆栈信息
 * 
 * try-catch-finally：真正的处理异常（积极的处理异常）
 * throws：消极的处理异常，并没有真正处理异常，而是将异常抛给了调用者，使程序编译的时候，不再报编译错误
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
