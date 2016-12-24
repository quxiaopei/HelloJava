package com.day02;
/**
 * 实体类
 * Person类用于描述整个人类的共同特征
 * 先定义类，再由类来创建对象（一个一个具体的人）
 * 属性的值属于某个具体对象的。
 * 一般方法也是属于具体对象的。
 * 
 * 构造方法：
 * 1.如果一个类中没有写任何构造方法，则默认有无参的构造方法。
 * 2.如果提供了其他构造方法，则默认的无参构造不再提供
 * 构造方法是一种特殊的方法
 * 1.写法上：名称和类名必须一致，没有返回值类型。
 * 2.作用上：用于创建对象
 * 
 * 重载：
 * 1.方法名相同，方法参数不同，称为方法的重载
 * 2.方法参数不同：参数个数不同、类型不同、顺序不同
 * 
 * 构造方法的相互调用问题：要避免死循环
 * this表示本类对象
 * 1.this（参数）表示对本类其他构造方法的调用
 * 2.this.来调用本类的属性
 * 可以按住ctrl键跳转
 */
public class Person {

String name;
int age;
private String sex;
public Person() {
	System.out.println("我是无参构造方法");
	}
public Person(String sex){
	this.sex=sex;
}
public Person(String name,String sex){
	this(sex);
	this.name=name;
}
public void speak(){
	System.out.println("会说话");
}
public void walk(){
	System.out.println("能走路");
}
public void desc(){
	System.out.println("我叫"+name+"今年"+age+"性别是"+sex);
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((sex == null) ? 0 : sex.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Person other = (Person) obj;
	if (age != other.age)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (sex == null) {
		if (other.sex != null)
			return false;
	} else if (!sex.equals(other.sex))
		return false;
	return true;
}
}
