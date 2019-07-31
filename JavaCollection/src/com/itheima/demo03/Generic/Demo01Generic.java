package com.itheima.demo03.Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
	
	public static void main(String[] args) {
		show01();
	}
	/*
	 * 创建集合对象  不使用泛型
	 * 好处:集合不使用泛型 默认的类型是object类型 可以存储任意类型的数据
	 * 弊端:不安全 会发生异常
	 */
	private static void show01(){
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add(1);
		
		//使用迭代器遍历list集合
		//获取迭代器
		Iterator it = list.iterator();
		while(it.hasNext()){
			//取出的元素也是object类型
			Object obj = it.next();
			System.out.println(obj);
			
			//想要使用string类特有的方法 length获取字符串的长度 ；不能使用 多态 object obj = "abc";
			//需要向下转型
			//会抛出 ClassCastException	类型转换异常	不能把Interger类型转换为String类型
			String s = (String)obj;
			System.out.println(s.length());
		}
		
	}
	
	
}
