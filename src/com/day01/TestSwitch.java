package com.day01;

import java.util.Scanner;

public class TestSwitch {
public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	System.out.println("������һ��5���Ƶķ�����");
	int score=scan.nextInt();
	switch(score){
	case 5:
		System.out.println("����");
		break;
	case 4:
		System.out.println("����");
		break;
	case 3:
		System.out.println("����");
		break;
	case 2:
	
	case 1:

	case 0:
		System.out.println("������");
		break;
	default:
		System.out.println("�������");
	}
	
	/*
	if(score==5){
		System.out.println("����");
	}else if(score==4){
		System.out.println("����");
	}else if(score==3){
		System.out.println("����");
	}else if(score==2||score==1||score==0){
		System.out.println("������");
	}else{
		System.out.println("�������");}
	*/
	}
}
