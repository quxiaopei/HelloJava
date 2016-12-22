package com.day01;

import java.util.Scanner;

public class TestSwitch {
public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	System.out.println("请输入一个5分制的分数：");
	int score=scan.nextInt();
	switch(score){
	case 5:
		System.out.println("优秀");
		break;
	case 4:
		System.out.println("良好");
		break;
	case 3:
		System.out.println("及格");
		break;
	case 2:
	
	case 1:

	case 0:
		System.out.println("不及格");
		break;
	default:
		System.out.println("输入错误");
	}
	
	/*
	if(score==5){
		System.out.println("优秀");
	}else if(score==4){
		System.out.println("良好");
	}else if(score==3){
		System.out.println("及格");
	}else if(score==2||score==1||score==0){
		System.out.println("不及格");
	}else{
		System.out.println("输入错误");}
	*/
	}
}
