package com.itheima.demo01.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*
 * map集合遍历的第二种方式：使用Entry对象遍历
 * 
 * map集合中方法
 * Set<Map,Entry<K,V>> entrySet()  返回此映射中包含的映射关系的set视图
 * 
 * 实现步骤：
 * 	1.使用map集合中的方法entryset() 把map集合中多个Entry对象取出来 存储到一个set集合中
 *  2.遍历set集合 获取每一个Entry对象
 *  3.使用Entry对象中的方法getKey()和getValue()获取键与值
 * 
 */
public class Demo03EntrySet {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		while(it.hasNext()){
			Entry<String, Integer> entry = it.next();
			
			String key = entry.getKey();
			Integer value = entry.getValue();
		}
		
	}
	
}
