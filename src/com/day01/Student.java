package com.day01;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		 String [] name=new String[2];
		 int [] score=new int[2];
		 Scanner scan=new Scanner(System.in);
		 for(int i=0;i<2;i++){
			 System.out.println("������������");
			 name[i]=scan.next();
			 System.out.println("������ַ�����");
			 score[i]=scan.nextInt();
		 }
		 System.out.println(Arrays.toString(name));
		 System.out.println(Arrays.toString(score));
		 //���ݸ����������������Ӧ�ĳɼ�
		 System.out.println("������ѧ��������");
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
			 System.out.println("���޴���");
		 }else{
		 System.out.println(name[i]+"ѧ��������"+score[i]);}
		 //ͳ��ȫ���ƽ���ɼ�
		 double amount=0;
		 for(int j=0;j<2;j++){
			 amount=amount+score[j];
		 }
		 double average=amount/2;
		 System.out.println("ƽ���ɼ���"+average);
		 //ͳ����߳ɼ�
		 int big = 0;
		 for(int j=1;j<2;j++){
			 big=score[0];
			 if(score[j]>big){
				 big=score[j];
			 }
		 }
		 System.out.println("��߳ɼ��ǣ�"+big);
	}

}
