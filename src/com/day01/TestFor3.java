package com.day01;
/**
 * ��ѭ��+break/continue�����ڲ���������ѭ��
 *
 */
public class TestFor3 {
	public static void main(String[] args) {
		for(int i=0;;i++){
			if(i==1233)
				continue;
			if(i==1234){
				break;
			}
			System.out.println(i+"hello world");
		}
	}
}
