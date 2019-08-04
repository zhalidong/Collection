package com.itheima.demo01.getName;
/*
 * 获取线程的名称：
 * 		1.使用Thread类中的方法
 * public final String getName()返回此线程的名称
 * 		2.可以先获取到当前正在执行的线程  使用线程中的方法getName()获取线程的名称
 * static Thread currentThread() 
返回对当前正在执行的线程对象的引用。 
 * 
 */
//定义一个Thread类的子类
public class MyThread extends Thread{
	
	@Override
	public void run() {
		//获取线程的名称
		String name = getName();
		System.out.println(name);
		//链式编程
		System.out.println(Thread.currentThread().getName());
	}
}
