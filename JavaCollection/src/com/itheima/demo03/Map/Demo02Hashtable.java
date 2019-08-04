package com.itheima.demo03.Map;

import java.util.Hashtable;

/*
 * Hashtable(K,V) 
 * 底层也是一个哈希表  是一个线程安全的集合 是单线程集合  速度慢
 * HashMap 底层是一个哈希表 是一个线程不安全的集合 是多线程的集合 速度快
 * HashMap集合：可以存储null值 null键
 * Hasttable集合：不能存储null值 null键
 * 
 * 
 * 
 */
public class Demo02Hashtable {
	public static void main(String[] args) {
		
		Hashtable<String, String> table = new Hashtable<>();
		table.put(null, "a");	//空指针异常
		table.put("b", null);	//空指针异常
		
		
	}
}
