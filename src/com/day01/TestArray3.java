package com.day01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * 
 * 1.Ҫ���������������ʹ��Java api��java.lang���е�Math��. 
 * Math���Ծ�̬�����ķ�ʽ�ṩ���õ���ѧ������
 * ����Math.random()������һ�����Բ���[0.0,1.0]�����ڵ�һ��˫���ȸ������ķ������� 
 * �磺 ����һ��100���ڵ�������int
 * x=(int)(Math.random()*100); ���磺 ����һ��1-50֮����������int
 * x=1+(int)(Math.random()*50) 
 * 2.Random ram=new Random(); ram.nextInt(2);
 * 3.Arrays�ṩ�������һЩ��̬����
 *
 */
public class TestArray3 {
	public static void main(String[] args) {
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100);
			Random ram = new Random();
			ram.nextInt(2);

		}
		int[] bubble = num;
		for (int i = 0; i < bubble.length; i++) {
			for (int j = i + 1; j < bubble.length; j++) {
				int before = bubble[i];
				if (bubble[i] < bubble[j]) {

				}
			}
		}
		int temp = 0;

		for (int i = 0; i < bubble.length; i++) {

			for (int j = i + 1; j < bubble.length; j++) {

				if (bubble[i] > bubble[j]) {

					temp = bubble[i];

					bubble[i] = bubble[j];

					bubble[j] = temp;

				}

			}

		}
		for (int i = 0; i < bubble.length; i++)

			System.out.println(bubble[i]);
		System.out.println(Arrays.toString(num));
	}
}
