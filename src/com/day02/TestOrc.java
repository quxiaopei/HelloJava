package com.day02;

import java.util.Random;
import java.util.Scanner;

public class TestOrc {
	public static void main(String[] args) {
		//创建一个食人怪
		Orc orc=new Orc("食人怪",500,5);
		orc.desc();
		System.out.println("你进入了食人怪腹地");
		//腹地初始化
		Orc[] orcArray=new Orc[10];
		Random r=new Random();
		String[] nameArr={"张三怪","王五怪","李四怪"};	
		for(int i=0;i<orcArray.length;i++){
			int rlv=r.nextInt(5)+1;
			int rname=r.nextInt(3);
			orcArray[i]=new Orc(nameArr[rname],rlv*100,rlv);
		}
		System.out.println("数据初始化完成");
		for(int i=0;i<orcArray.length;i++){
			orcArray[i].desc();
		}

		Scanner s=new Scanner(System.in);
		System.out.println("请输入1释放血战八方");
		int n=s.nextInt();
		
		if(n==1){
			System.out.println("释放技能血战八方，减血300");
			for(int i=0;i<orcArray.length;i++){
				if(orcArray[i].hp<=300){
					System.out.println(orcArray[i].name+"被秒杀了");
				}else{
					orcArray[i].hp-=300;
					orcArray[i].desc();
				}
			}
		}
	}
}
