package com.day03.exception;

public class TestTry {
	public static void main(String[] args) {

		try {// �ſ��ܻᷢ���쳣�Ĵ���
			String s = null;

		} catch (Exception e) {// ��try���׳��쳣ʱ��������Exception e=new
								// NullPointException();

			e.printStackTrace();// ��ӡ�쳣�Ķ�ջ��Ϣ
		}
		System.out.println("��������");
	}
}
