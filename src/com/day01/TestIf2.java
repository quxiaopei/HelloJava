package com.day01;

import java.util.Scanner;

public class TestIf2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���������䣺");
		int age = scan.nextInt();
		if (age > 70) {
			System.out.println("������");
		} else if (age > 40) {
			System.out.println("������");
		} else if (age > 25) {
			System.out.println("������");
		} else {
			System.out.println("������");
		}
	}

}
