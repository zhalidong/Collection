package com.itheima.demo05.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Collections集合工具类 用来对集合进行操作
 * public static  <T> void sort(List<T> list,Comparator<? super T>):将集合按照指定规则排序
 * 
 * Comparator和Comparable区别：
 * 		Comparable：自己(this)和别人(参数)比较 自己需要实现Comparable接口 重写比较的规则compareTo方法
 * 		Comparator：相当于找一个第三方的裁判
 * Comparator的排序规则
 * 		o1-o2:升序
 * 		
 */
public class Demo02Sort3 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list01 = new ArrayList<>();
		list01.add(1);
		list01.add(3);
		list01.add(2);
		
		Collections.sort(list01, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;	//升序
			}
		});
		System.out.println(list01);
	}
	
}
