package com.day01;
/**
 *对java来说：
 *数据类型：基本数据类型，引用数据类型 
 *基本数据类型：8种： int byte short long boolean char float double
 *引用数据类型：类 接口 数组 枚举
 *重载：
 *1.参数类型不同
 *2.参数顺序不同 
 *3.参数的个数不同
 */
public class TestArgs {
 public static void main(String[] args) {
	 //方法调用，实际参数，简称实参
	with("wanglei");
}

private static void with(String string) {
//	方法定义，形式参数，简称形参
	System.out.println("and "+string);
}
private static void with(String str,String str2){
	
}
private static void with(int str2,String str){
	
}
private static void with(String str,int str2){
	
}
}
