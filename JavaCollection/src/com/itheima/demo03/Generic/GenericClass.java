package com.itheima.demo03.Generic;
/**
 * 定义一个含有泛型的类   模拟ArrayList集合
 * 泛型是一个未知的数据类型  当我们不确定需要声明类型的时候 可以使用泛型
 * 泛型可以接收任意的数据类型 可以使用Integer,string student
 * 创建对象的时候确定泛型的数据类型
 * 
 * @author Administrator
 *
 */
public class GenericClass<E> {

	private E name;

	public E getName() {
		return name;
	}

	public void setName(E name) {
		this.name = name;
	}
	
	
	
}
