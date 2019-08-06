package com.itheima.demo01.WaitAndNotify;
/*
 * 消费者(吃货)类 是一个线程类  可以继承Thread
 * 设置线程任务（run） 吃包子
 * 对包子的状态进行判断
 * false:没有包子
 * 		吃货调用wait方法进入等待状态
 * true:有包子
 * 		吃货吃包子
 * 		吃货吃完包子
 * 		修改包子的状态为false没有
 * 		吃货唤醒包子的线程生产包子
 * 
 * 
 */
public class ChiHuo {

}
