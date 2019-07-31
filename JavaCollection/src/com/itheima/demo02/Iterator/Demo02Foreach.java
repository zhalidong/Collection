package com.itheima.demo02.Iterator;

import java.util.ArrayList;

/*
 * 增强for循环:底层使用的也是迭代器	使用了for循环的格式简化了迭代器的书写
 * 是jdk1.5出现的新特性
 * 所有的单列集合都可以使用增强for
 * 作用:用来遍历集合和数组
 * 
 */
public class Demo02Foreach {
	
	public static void main(String[] args) {
		demo02();
		
	}
	//使用增强for循环遍历集合
	private static void demo02(){
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		
		for(String tmp:list){
			System.out.println(tmp);
		}
		
	}
	
	
	//使用增强for循环遍历数组
	private static void demo01(){
		int[] arr = {1,2,3,4,5};
		for(int i:arr){
			System.out.println(i);
		}
		
	}
	
}
