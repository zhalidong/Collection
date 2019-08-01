package com.itheima.demo03.Generic;

/*
 * 含有泛型的接口 的第一种使用方式：定义接口的实现类 实现接口 指定接口的泛型
 * public interface Iterator<E>{
 * 		E next();
 * }
 * 
 * Scanner类实现了Iterator接口 并指定接口的泛型是string 所以重写的next方法泛型默认就是string
 * public final class Scanner implements Iterator<String>{
 * 
 * }
 * 
 * 
 */
public class GenericInterfaceImpl implements GenericInterface<String>{

	@Override
	public void method(String i) {
		
		System.out.println(i);
	}

}
