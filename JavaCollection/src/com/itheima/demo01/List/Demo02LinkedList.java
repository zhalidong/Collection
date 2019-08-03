package com.itheima.demo01.List;

import java.util.LinkedList;

/*
 * java.util.inkedList集合 implements list接口
 * linklist集合的特点：
 * 		1.底层是一个链表结构 查询慢 增删块
 * 		2.里面包含了大量操作首尾元素的方法
 * 		注意:使用linkedlist集合特有的方法  不能使用多态
 * 		
 * 		public void addFirst(E e);将指定元素插入此列表的开头
		public void addLast(E e);将指定元素添加到此列表的结尾
		public void push(E e);将元素插入此列表所表示的堆栈

		public E getFirst();返回此列表的第一个元素
		public E getLast();返回此列表的最后一个元素

		public E removeFirst();移除并返回此列表的第一个元素
		public E removeLast();移除并返回此列表的最后一个元素
		public E pop();从此列表所表示的堆栈处弹出一个元素

		public boolean isEmpty();如果列表不包含元素 则返回true
 * 		
 * 
 */
public class Demo02LinkedList {

	public static void main(String[] args) {
		showo1();
		
	}

	private static void showo1() {
		
		//创建linkedlist集合对象
		LinkedList<String> linked = new LinkedList<>();
		linked.add("a");
		linked.add("b");
		linked.add("c");
		
		System.out.println(linked);
		
		//linked.addFirst("www");
		linked.push("www");
		System.out.println(linked);
		
		linked.clear();
		if(!linked.isEmpty()){
			
		}
		
	}
	
}








