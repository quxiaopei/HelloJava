package com.day02;

import java.util.Random;
import java.util.Scanner;

public class TestOrc {
	public static void main(String[] args) {
		//����һ��ʳ�˹�
		Orc orc=new Orc("ʳ�˹�",500,5);
		orc.desc();
		System.out.println("�������ʳ�˹ָ���");
		//���س�ʼ��
		Orc[] orcArray=new Orc[10];
		Random r=new Random();
		String[] nameArr={"������","�����","���Ĺ�"};	
		for(int i=0;i<orcArray.length;i++){
			int rlv=r.nextInt(5)+1;
			int rname=r.nextInt(3);
			orcArray[i]=new Orc(nameArr[rname],rlv*100,rlv);
		}
		System.out.println("���ݳ�ʼ�����");
		for(int i=0;i<orcArray.length;i++){
			orcArray[i].desc();
		}

		Scanner s=new Scanner(System.in);
		System.out.println("������1�ͷ�Ѫս�˷�");
		int n=s.nextInt();
		
		if(n==1){
			System.out.println("�ͷż���Ѫս�˷�����Ѫ300");
			for(int i=0;i<orcArray.length;i++){
				if(orcArray[i].hp<=300){
					System.out.println(orcArray[i].name+"����ɱ��");
				}else{
					orcArray[i].hp-=300;
					orcArray[i].desc();
				}
			}
		}
	}
}
