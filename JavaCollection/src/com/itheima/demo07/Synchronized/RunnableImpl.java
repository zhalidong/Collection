package com.itheima.demo07.Synchronized;
/**
 * 卖票问题出现了线程安全问题
 * 
 * 解决线程安全问题的第一种方案：使用同步代码块
 * 格式：
 * 		synchronized(锁对象){
 * 		可能会出现线程安全问题的代码（访问了共享数据的代码）
 * }
 * 
 * 注意：
 * 		1.通过代码块中的锁对象  可以使用任意的对象
 * 		2.但是必须保证多个线程使用的锁对象是同一个
 * 		3.锁对象作用：
 * 			把同步代码块锁住 只让一个线程在同步代码块中执行
 * @author Administrator
 *
 */
public class RunnableImpl implements Runnable{
	//定义一个多个线程共享的票源
	private int ticket=100;
	
	//创建一个锁对象
	Object obj = new Object();
	
	@Override
	public void run() {
		//使用死循环 让卖票重复执行
		while(true){
			//同步代码块
			synchronized (obj) {
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
	}

}
