package com.day02;
/**
 * ��̬��һ�����֣���������
 * ���֣���������ָ���������
 *��������
 *1.��������̬����������ָ���������ʱ������ֻ�ܵ��ø���ķ��������ܵ�������ķ���
 *2.��������̬ʱ��������õķ��������������д��������������д֮��ķ�����
 */
public class TestAnimal {
	public static void main(String[] args) {
		// ��������Ϊ ��������Ϊ
		// ������Ϊ �͹۴���
		Animal a = new Cat();
		a.eat();
		// 1.ǿ������ת�������������������д�Χת��ΪС��Χ��
		Cat cc = (Cat) a;
		// ���������ת��������Ҫ
		if (a instanceof Dog) {
			Dog dd = (Dog) a;
		}
		cc.otherMethod();

		Cat c = new Cat();
		c.otherMethod();
	}

}
