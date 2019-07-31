package com.itheima.demo02.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 迭代器(对集合进行遍历)
 * 有两个常用的方法
 * boolean hasNext()	如果有元素可以迭代 返回true
 * 	判断集合中有没有下一个元素 有就返回true 没有就返回false
 * E next()				返回迭代的下一个元素
 * 	取出集合中的下一个元素
 * Iterator迭代器是一个接口  我们无法直接使用 需要使用Iterator接口的实现类对象 获取实现类的方式比较特殊
 * Collection接口中有一个方法叫iterator() 这个方法返回的就是迭代器的实现对象
 * 
 */
public class Demo01Iterator {
	
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		
		coll.add("姚明");
		coll.add("科比");
		coll.add("麦迪");
		coll.add("詹姆斯");
		
		Iterator<String> it = coll.iterator();	//获取迭代器的实现类对象
		while(it.hasNext()){					//判断集合中还有没有下一个元素
			String next = it.next();			//1.取出下一个元素	2.会把指针向后移动一位
			System.out.println(next);
		}
		//没有元素 返回false 再取出元素  会抛出异常NosuchElementException
	}
	
}
