package com.itheima.demo08.SynchronizedMethod;
/**
 * 实现卖票案例出现了线程安全问题
 * 卖出了不存在的票和重复的票
 * 
 * 解决线程安全的问题的第二种方法：使用同步方法
 * @author Administrator
 *
 *使用步骤：
 *		1.把访问了共享数据的代码抽取出来 放到一个方法中
 *		2.在方法上添加synchronized修饰符
 *
 *格式：定义方法的格式
 *修饰符 synchronized 返回值类型 方法名（参数列表）{
 *	可能会出现线程安全问题的代码（访问了共享数据的代码）
 *}
 *
 *
 */
public class RunnableImpl implements Runnable{
	//定义一个多个线程共享的票源
	private int ticket=100;
	
	
	@Override
	public void run() {
		//使用死循环 让卖票重复执行
		while(true){
			payTicket();
		}
	}
	
	/*
	 * 定义一个同步方法
	 * 同步方法也会把方法内部的代码锁住
	 * 只让一个线程执行
	 * 同步方法的锁对象是实现类对象 new RunnableImpl()
	 * 也就是this
	 * 
	 */
		public synchronized void payTicket(){
			if(ticket>0){
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"-->"+ticket);
				ticket--;
				}
		}

}
