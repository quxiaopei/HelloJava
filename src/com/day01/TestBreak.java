package com.day01;
/**
 * �����ؼ��ֵ��÷�
 *1.���еĹؼ��ֶ���Сд��
 *2.������ʱ�򣬲�Ҫʹ�ùؼ���
 *
 *break������forѭ��
 *continue����������ѭ���������´�ѭ����������������ݣ�����i++
 */
public class TestBreak {
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			if(i==3){
				continue;
//				break;
			}
			System.out.println(i);
		}
	}
}
