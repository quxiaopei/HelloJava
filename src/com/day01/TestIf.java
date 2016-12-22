package com.day01;
/**
 *根据给定的身份证号，判断性别
 *1.取得第17位
 *2.判断奇偶
 *3.输出判断结果 
 *
 */
public class TestIf {
public static void main(String[] args) {
	String id="61040319930118302X";
//	前闭后开。
    String subId=id.substring(16, 17);
    int num=Integer.parseInt(subId);
	if(num%2==0){
		System.out.println("性别为女");
	}else{
		System.out.println("性别为男");
	}
	System.out.println("其他内容");
}
}
