package com.itheima.demo03.Generic;
/*
 * 测试含有泛型的方法
 */
public class Demo03GenericMethod {
	
	public static void main(String[] args) {
		GenericMethod gc = new GenericMethod();
		/*
		 * 调用含有泛型的方法 传递什么类型的参数 泛型就是什么类型
		 */
		gc.method1(10);
		gc.method1("abc");
		gc.method1(true);
		
		//静态方法  通过类名.方法名（参数） 可以直接调用
		GenericMethod.method2("静态方法");
		
		
		
	}
	

	
}
