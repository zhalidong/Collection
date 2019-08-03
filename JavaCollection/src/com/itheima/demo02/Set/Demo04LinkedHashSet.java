package com.itheima.demo02.Set;

import java.util.HashSet;

/*
 * LinkedHashSet集合 extends HashSet集合
 * LinkedHashSet 集合的特点：
 * 			底层是一个哈希表(数组+链表/红黑树)+链表 多了一条链表(记录映射的存储顺序) 保证元素有序
 * 
 */
public class Demo04LinkedHashSet {
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("www");
		set.add("abc");
		set.add("abc");
		set.add("ItCAST");
		System.out.println(set);	//无序  不允许重复
		
		
		
		
		
		
	}
	
}
