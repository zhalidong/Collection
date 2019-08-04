package com.itheima.demo06.ThreadSafe;
/**
 * 实现卖票案例
 * @author Administrator
 *
 */
public class RunnableImpl implements Runnable{
	//定义一个多个线程共享的票源
	private int ticket=100;
	
	
	@Override
	public void run() {
		//使用死循环 让卖票重复执行
		while(true){
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
