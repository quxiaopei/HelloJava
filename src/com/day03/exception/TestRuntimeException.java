package com.day03.exception;
/**
 * 当一个对象为null时，使用对象，来调用该对象的属性或方法，则会报错NullPointException
 * 
 * Throwable：所有的异常都是可以抛出的
 * 
 * 运行时异常：
 * 程序运行的时候次啊会报出来的异常
 * 非运行时异常（检测时异常）：
 *
 */
public class TestRuntimeException {
public static void main(String[] args) {
/*	String s=null;
	//程序发生异常（生成了一个NullPointException的对象，并且抛给jvm，jvm将程序终止
	char c=s.charAt(0);*/
	/*String s2="qbd";
	Integer.parseInt(s2);*/
	int[] array={1,2,3};
int i=array[3];
     System.out.println(array[5]);
}
}
