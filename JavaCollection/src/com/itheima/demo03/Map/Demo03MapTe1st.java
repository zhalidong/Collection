package com.itheima.demo03.Map;

import java.util.HashMap;
import java.util.Scanner;

/*
 * 练习：
 * 		计算一个字符串中每个字符出现的次数
 * 分析：
 * 	1.使用scanner获取用户输入的字符串
 * 	2.创建map集合 key是字符串中的字符  value是字符的个数
 *  3.遍历字符串 获取每一个字符
 *  4.使用获取到的字符 去map集合判断key是否存在
 *  	key存在;
 *  		通过字符(key) 获取value(字符个数)
 *  		value++
 *  		put(key,value)把新的value存储到map集合中
 *  	key不存在：
 *  		put(key,1)
 *  5.遍历map集合  输出结果
 */
public class Demo03MapTe1st {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入");
		String str = sc.next();
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c:str.toCharArray()){
			if(map.containsKey(c)){
				Integer value = map.get(c);
				value++;
				map.put(c, value);
			}else {
				map.put(c, 1);
			}
		}
		
		for(Character key:map.keySet()){
			Integer value = map.get(key);
			System.out.println(value);
		}
			
	}
}
