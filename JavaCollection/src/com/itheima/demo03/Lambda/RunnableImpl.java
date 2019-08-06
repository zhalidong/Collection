package com.itheima.demo03.Lambda;
/*
 * 创建Runnable接口的实现类  重写run 方法
 */
public class RunnableImpl implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}

}
