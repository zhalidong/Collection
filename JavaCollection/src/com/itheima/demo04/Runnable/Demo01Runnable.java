package com.itheima.demo04.Runnable;
/*
 * 
 * 创建多线程的第二种方式：实现Runnable接口
 * Runnable接口应由任何类实现，其实例将由线程执行。 该类必须定义一个无参数的方法，称为run 
 * Thread(Runnable target) 
      分配一个新的 Thread对象。  
   Thread(Runnable target, String name) 
      分配一个新的 Thread对象。 
 * 
 * 实现步骤:
 * 		1.创建一个Runnable接口的实现类
 * 		2.在实现类中重写Runnable接口的run方法 设置线程任务
 * 		3.创建一个Runnable接口的实现类对象
 * 		4.创建Thread对象 构造方法中传递Runnable接口的实现类对象
 * 		5.调用Thread类中的start方法 开启新的线程执行run方法
 * 
 * 
 * 
 */
public class Demo01Runnable {
	public static void main(String[] args) {
		RunnableImpl run = new RunnableImpl();
		Thread t = new Thread(run);
		t.start();
		
		
		for(int i=0;i<20;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
}
