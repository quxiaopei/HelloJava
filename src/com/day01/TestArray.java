package com.day01;
/**
 * ��ͬ�������͵����ݵļ���
 * ����ĳ���
 *
 */
public class TestArray {
public static void main(String[] args) {
//	��̬��ʼ��
	System.out.println("��̬��ʼ��");
	int[]arr={90,87,100,99};
	String[] strArr={"����","����","����"};
//	��̬��ʼ��
	System.out.println("��̬��ʼ��");
	int[] scorArr=new int[5];
	scorArr[0]=99;
	scorArr[1]=79;
	scorArr[2]=99;
	scorArr[3]=99;
	for(int i=0;i<scorArr.length;i++){
		System.out.println(scorArr[i]);
	}
//	Ĭ�ϳ�ʼ��  intĬ��ֵ��0��StringĬ����null
	System.out.println("Ĭ�ϳ�ʼ��");
	int[] arrInt=new int[2];
	for(int i=0;i<arrInt.length;i++)
	System.out.println(arrInt[i]);
}
}
