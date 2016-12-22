package com.day01;

import java.util.Scanner;

public class TestIf2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年龄：");
		int age = scan.nextInt();
		if (age > 70) {
			System.out.println("老年人");
		} else if (age > 40) {
			System.out.println("中年人");
		} else if (age > 25) {
			System.out.println("青年人");
		} else {
			System.out.println("青少年");
		}
	}

}
