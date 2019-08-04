package com.itheima.demo01.getName;
/*
 * 线程的名称：
 * 	主线程 main
 *  新线程 Thread-0
 */

public class Demo01GetThreadName {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		
		
	}
	
}
