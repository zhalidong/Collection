package com.itheima.demo01.Map;
/*
 * map集合的第一种遍历方式：通过键找值的方式
 * map集合中的方法：
 * 		Set<K> keyset()	返回此映射中包含的键的set视图
 * 实现步骤：
 * 		1.使用map集合中的方法keyset()  把map集合所有的key取出来 存储到一个set集合中
 * 		2.遍历set集合  获取map集合中的每一个key
 * 		3.通过map集合中的方法get(key) 通过key找到value
 * 
 * 
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo02KeySet {
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		//1.使用map集合中的方法keyset()  把map集合所有的key取出来存储到一个set集合
		Set<String> set = map.keySet();
		
		//2.遍历set集合 获取map集合中每一个key
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String next = it.next();
			//3.通过map集合中的方法get  通过key找到value
			Integer value = map.get(next);
			System.out.println(value);
		}
	}
}
