package com.itheima.demo09.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 实现卖票案例
 * 
 * 解决线程安全问题的第三张方案：使用Lock锁
 * java.util.concurrent.Locks.Lock接口
 * Lock实现提供比使用synchronized方法和语句可以获得的更广泛的锁定操作
 * Lock接口中的方法：
 * 		void lock() 
			获得锁。 
 * void unlock() 
		释放锁。 
		
	使用步骤：
		1.在成员位置创建一个ReentrantLock对象
		2.在可能会出现安全问题的代码前调用Lock接口中的方法lock获取锁
		3.在可能会出现安全问题的代码后调用Lock接口后的方法unLock释放锁
		
 * @author Administrator
 *
 */
public class RunnableImpl implements Runnable{
	//定义一个多个线程共享的票源
	private int ticket=100;
	//1.在成员位置创建一个ReentrantLock对象
	Lock l = new  ReentrantLock();
	
	
	@Override
	public void run() {
		//使用死循环 让卖票重复执行
		while(true){
		//2.在可能会出现安全问题的代码前调用Lock接口中的方法lock获取锁
		l.lock();	
			
		if(ticket>0){
			try {
				Thread.sleep(10);
				System.out.println(Thread.currentThread().getName()+"-->"+ticket);
				ticket--;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				
				//3.在可能会出现安全问题的代码后调用Lock接口后的方法unLock释放锁
				l.unlock();//无论程序是否异常  都会把锁释放
				}
			}
		}
	}

}
