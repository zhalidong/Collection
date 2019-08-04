package com.itheima.demo03.Map;

import java.util.HashMap;

/*
 * extends HashMap<K,V>
 * Map 接口的哈希表和链表的实现  具有可预知的迭代顺序
 * 底层原理：
 * 		哈希表+链表（记录元素的顺序）
 * 
 */
public class Demo01LinkedHashMap {
	
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("a", "a");
		map.put("c", "c");
		map.put("b", "b");
		System.out.println(map); 	//key不允许重复  无序
		
		
	}
	
}
