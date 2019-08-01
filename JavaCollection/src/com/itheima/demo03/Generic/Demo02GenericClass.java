package com.itheima.demo03.Generic;

public class Demo02GenericClass {

	public static void main(String[] args) {
		//不写泛型默认是object类型
		GenericClass gc = new GenericClass();
		gc.setName("只能是字符串");
		Object obj = gc.getName();
		
		//创建GenericClass对象  泛型使用Integer类型
		GenericClass<Integer> gc2 = new GenericClass<Integer>();
		gc2.setName(1);
		Integer num = gc2.getName();
		
		System.out.println(num);
		//创建GenericClass对象  泛型使用string类型
		GenericClass<String> gc3 = new GenericClass<String>();
		gc3.setName("小明");
		String name1 = gc3.getName();
		System.out.println(name1);
		
	}
}
