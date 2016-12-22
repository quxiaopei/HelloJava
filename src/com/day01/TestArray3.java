package com.day01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * 
 * 1.要产生随机数，可以使用Java api中java.lang包中的Math类. 
 * Math类以静态方法的方式提供常用的数学方法，
 * 其中Math.random()方法是一个可以产生[0.0,1.0]区间内的一个双精度浮点数的方法搜索 
 * 如： 产生一个100以内的整数：int
 * x=(int)(Math.random()*100); 又如： 产生一个1-50之间的随机数：int
 * x=1+(int)(Math.random()*50) 
 * 2.Random ram=new Random(); ram.nextInt(2);
 * 3.Arrays提供了数组的一些静态方法
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
