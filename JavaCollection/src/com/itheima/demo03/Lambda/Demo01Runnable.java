package com.itheima.demo03.Lambda;
/*
 * 使用实现Runnable接口的方式实现多线程
 */
public class Demo01Runnable {
	public static void main(String[] args) {
		RunnableImpl t = new RunnableImpl();
		Thread thread = new Thread(t);
		thread.start();
		
		//简化代码  匿名内部类
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());

			}
		};
		
		new Thread(runnable).start();
		
		
		//继续简化代码
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		});
		
		
		
		
	}
}
