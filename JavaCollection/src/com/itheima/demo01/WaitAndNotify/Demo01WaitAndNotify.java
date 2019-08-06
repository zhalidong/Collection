package com.itheima.demo01.WaitAndNotify;
/*
 * 等待唤醒案列：线程之间的通信
 * 		创建一个顾客线程(消费者)：告知老板要的包子的种类和数量  调用wait方法 放弃cpu的执行 进入waiting状态(无限等待)
 * 		创建一个老板线程（生产者）：花了5s做包子 做好包子后 调用notify方法  唤醒顾客吃包子
 * 
 * 
 * 注意事项：
 * 		顾客和老板线程必须使用同步代码块包裹起来 保证等待和唤醒只能有一个在执行
 * 		同步使用的锁对象必须保证唯一
 * 		只有锁对象才能调用wait和notify方法
 * 
 * object类中方法
 * void wait() 
		导致当前线程等待，直到另一个线程调用该对象的 notify()方法或 notifyAll()方法 

   void notify() 
		唤醒正在等待对象监视器的单个线程。 会继续执行wait方法之后的代码
 * 
 */
public class Demo01WaitAndNotify {
	public static void main(String[] args) {
		
		
		
	}
}
