package com.itheima.demo01.Map;

import java.util.HashMap;

/*
 * Map<k,v>集合
 * Map集合的特点：
 * 		1.Map集合是一个双列集合 一个元素包含两个值(一个key  一个value)
 * 		2.Map集合中的元素 key和value的数据类型是可以相同  也可以不同
 * 		3.Map集合中的元素 key是不允许重复的 value是可以重复的
 * 		4.Map集合中的元素 key和value是一一对应的
 * 
 * HashMap集合的特点：
 * 		1.HashMap集合的底层是哈希表：查询的速度特别快
 * 		2.hashmap集合是一个无序的集合  存储元素和取出元素的顺序有可能不一样
 * LinkedHashMap的特点：
 * 		1.linkedhashmap集合底层是哈希表+链表（保证迭代的顺序）
 * 		2.linkedhashmap集合是一个有序的集合 存储元素和取出元素的顺序是一致的
 * 
 */
public class Demo01Map {
	
	public static void main(String[] args) {
		show03();
		
	}
	/*
	 * boolean containsKey(Object key) 判断集合中是否包含指定的键
	 * 包含返回true   不包含返回false
	 * 
	 */
	
	
	
	/*
	 * public V get(Object key)	根据指定的键  在map集合中获取对应的值
	 * 返回值：
	 * 		key存在  返回对应的value值
	 * 		key不存在 返回null
	 * 
	 */
	
	
	private static void show03() {
		
		
	}
	/*
	 * public V remove(Object key)   把指定的键  所对应的键值元素  在map集合中删除 返回被删除的元素的值
	 * 返回值 V 
	 * 		key存在 v返回被删除的值
	 * 		key不存在 v返回null
	 */
	

	private static void show02() {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("查", 199);
		Integer i = map.remove("查");
		System.out.println(i);
	}
	/*
	 * public V put(K key,V value);把指定的键与指定的值添加到map集合中
	 * 		返回值：
	 * 			存储键值对的时候  key不重复  返回值v是null
	 * 			存储键值对的时候 key重复	 会使用新的value替换map中重复的value 返回被替换的value值
	 */
	private static void show01() {
		//创建map集合对象 多态
		HashMap<String,String> map = new HashMap<>();
		
		String v1 = map.put("李晨", "范冰冰1");
		System.out.println("v1:"+v1);
		String v2 = map.put("李晨", "范冰冰2");
		System.out.println("v1:"+v2);
		
		System.out.println(map);
		
	}
	
}
