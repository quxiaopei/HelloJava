package com.day01;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		 String [] name=new String[2];
		 int [] score=new int[2];
		 Scanner scan=new Scanner(System.in);
		 for(int i=0;i<2;i++){
			 System.out.println("请输入姓名：");
			 name[i]=scan.next();
			 System.out.println("请输入分分数：");
			 score[i]=scan.nextInt();
		 }
		 System.out.println(Arrays.toString(name));
		 System.out.println(Arrays.toString(score));
		 //根据给定的姓名，查出对应的成绩
		 System.out.println("请输入学生姓名：");
		 String queryName=scan.next();
		 int i;
		 boolean result=false;
		 for( i=0;i<2;i++){
			 if(name[i].equals(queryName)){
				 result=true;
				 break;
			 }
		 }
		 if(result==false){
			 System.out.println("查无此人");
		 }else{
		 System.out.println(name[i]+"学生分数是"+score[i]);}
		 //统计全班的平均成绩
		 double amount=0;
		 for(int j=0;j<2;j++){
			 amount=amount+score[j];
		 }
		 double average=amount/2;
		 System.out.println("平均成绩是"+average);
		 //统计最高成绩
		 int big = 0;
		 for(int j=1;j<2;j++){
			 big=score[0];
			 if(score[j]>big){
				 big=score[j];
			 }
		 }
		 System.out.println("最高成绩是："+big);
	}

}
