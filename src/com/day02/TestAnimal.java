package com.day02;
/**
 * 多态：一个表现，两个定理
 * 表现：父类引用指向子类对象
 *两条定理：
 *1.当发生多态（父类引用指向子类对象）时，引用只能调用父类的方法，不能调用子类的方法
 *2.当发生多态时，如果调用的方法子类进行了重写，则会调用子类重写之后的方法。
 */
public class TestAnimal {
	public static void main(String[] args) {
		// 编译器认为 运行器认为
		// 主观认为 客观存在
		Animal a = new Cat();
		a.eat();
		// 1.强制类型转化：（基本数据类型中大范围转化为小范围）
		Cat cc = (Cat) a;
		// 会出现类型转换错误，需要
		if (a instanceof Dog) {
			Dog dd = (Dog) a;
		}
		cc.otherMethod();

		Cat c = new Cat();
		c.otherMethod();
	}

}
