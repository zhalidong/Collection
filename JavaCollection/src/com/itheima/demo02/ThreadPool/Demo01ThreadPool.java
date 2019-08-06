package com.itheima.demo02.ThreadPool;
/*
 * 线程池：jdk1.5之后提供的
 * Executors类中静态方法
 * 
 * static ExecutorService newFixedThreadPool(int nThreads) 
创建一个线程池，该线程池重用固定数量的从共享无界队列中运行的线程。 
参数：
	int nThreads:创建线程池中包含的线程数量
返回值：
	ExecutorService接口 返回的是ExecutorService接口的实现类对象 我们可以使用ExecutorService接口接收（面向接口编程）
 * 用来从线程池中获取线程 调用start方法 执行线程任务
 * submit(Runnable task)提交一个Runnable任务用于执行
 * 
 * 线程池的使用步骤：
 * 		1.使用线程池的工厂类Executors里面提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
 * 		2.创建一个类实现Runnable接口重写run方法 设置线程任务
 * 		3.调用ExecutorService中的方法submit 传递线程任务  开启线程 执行run方法
 * 		4.调用ExecutorService中的方法shutdown销毁线程池 不建议
 * 
 */
public class Demo01ThreadPool {
	
	public static void main(String[] args) {
		
		
	}
	
}
