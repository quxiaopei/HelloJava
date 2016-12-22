package com.day01;
/**
 * 相同数据类型的数据的集合
 * 数组的长度
 *
 */
public class TestArray {
public static void main(String[] args) {
//	静态初始化
	System.out.println("静态初始化");
	int[]arr={90,87,100,99};
	String[] strArr={"张三","李四","王五"};
//	动态初始化
	System.out.println("动态初始化");
	int[] scorArr=new int[5];
	scorArr[0]=99;
	scorArr[1]=79;
	scorArr[2]=99;
	scorArr[3]=99;
	for(int i=0;i<scorArr.length;i++){
		System.out.println(scorArr[i]);
	}
//	默认初始化  int默认值是0；String默认是null
	System.out.println("默认初始化");
	int[] arrInt=new int[2];
	for(int i=0;i<arrInt.length;i++)
	System.out.println(arrInt[i]);
}
}
