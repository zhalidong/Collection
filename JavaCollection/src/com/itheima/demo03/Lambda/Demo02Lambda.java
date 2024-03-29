package com.itheima.demo03.Lambda;
/*
 * Lambda表达式的标准格式：
 * 		a.一些参数
 * 		b.一个箭头
 * 		c.一段代码
 *	格式：
 *		(参数列表) -> {一些重写方法的代码};
 *	解释说明格式：
 *		():接口中抽象方法的参数列表 没有参数就空着 有参数就写出参数  多个参数使用逗号分隔
 *		->:传递的意思 把参数传递给方法体{}
 *		{}:重写接口的抽象方法的方法体
 * 
 */
public class Demo02Lambda {
	
	public static void main(String[] args) {
		//使用lamdba表达式实现多线程
		new Thread(()->{
			System.out.println(Thread.currentThread().getName());
		}).start();
		
	}
}
