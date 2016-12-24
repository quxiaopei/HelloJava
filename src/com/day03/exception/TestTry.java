package com.day03.exception;

public class TestTry {
	public static void main(String[] args) {

		try {// 放可能会发生异常的代码
			String s = null;

		} catch (Exception e) {// 当try中抛出异常时，并处理。Exception e=new
								// NullPointException();

			e.printStackTrace();// 打印异常的堆栈信息
		}
		System.out.println("其他代码");
	}
}
