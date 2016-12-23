package com.day02;
/**
 * 基本数据类型：
 * byte
 * 整型：byte short int long
 * 浮点型：float double
 * 布尔类型：boolean
 * 字符类型：char
 *
 */
public class TestTime {
public static void main(String[] args) {
	//当前时间距离1970年1月1号0点时间差的毫秒值
	long time=System.currentTimeMillis();
	//数据类型转换
//	强制类型转化 小的可以自动转换成大的
	byte a=1;
	int b=a;
	
	int c=2;
	byte d=(byte)c;	
}
}
