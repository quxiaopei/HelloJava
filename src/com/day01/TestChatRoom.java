package com.day01;

import java.util.Scanner;

/**
 * 模拟聊天室： 1.用户输入一句话 
 * 2.判断输入内容是否合法 
 * 3.聊天室中输出一句话 
 * 4.继续
 */
public class TestChatRoom {
	public static void main(String[] args) {
		System.out.println("欢迎 来到聊天室");
		Scanner scan = new Scanner(System.in);
		for (;;) {
			System.out.println("请说：");
			String word = scan.next();
			if (word.equals("bye")) {
				System.out.println("您说的内容：" + word);
				break;
			} else if (word.equals("yi")) {
				System.out.println("您说的内容：" + "####");
			} else {
				System.out.println("您说的内容：" + word);
			}

		}
	}
}
