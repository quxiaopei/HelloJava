package com.day01;

import java.util.Scanner;

/**
 * ģ�������ң� 1.�û�����һ�仰 
 * 2.�ж����������Ƿ�Ϸ� 
 * 3.�����������һ�仰 
 * 4.����
 */
public class TestChatRoom {
	public static void main(String[] args) {
		System.out.println("��ӭ ����������");
		Scanner scan = new Scanner(System.in);
		for (;;) {
			System.out.println("��˵��");
			String word = scan.next();
			if (word.equals("bye")) {
				System.out.println("��˵�����ݣ�" + word);
				break;
			} else if (word.equals("yi")) {
				System.out.println("��˵�����ݣ�" + "####");
			} else {
				System.out.println("��˵�����ݣ�" + word);
			}

		}
	}
}
