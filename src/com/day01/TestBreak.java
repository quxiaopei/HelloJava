package com.day01;
/**
 * 两个关键字的用法
 *1.所有的关键字都是小写的
 *2.命名的时候，不要使用关键字
 *
 *break：结束for循环
 *continue：结束本次循环，进入下次循环，跳过后面的内容，进入i++
 */
public class TestBreak {
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			if(i==3){
				continue;
//				break;
			}
			System.out.println(i);
		}
	}
}
