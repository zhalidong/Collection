package com.itheima.demo03.hashCode;
/*
 * 哈希值：是一个十进制的整数	由系统随机给出的（就是对象的地址值  是一个逻辑地址  是模拟出来的地址  不是数据实际的物理地址）
 * 在object有一个方法可以获取对象的哈希值
 * int hashCode（） 返回该对象的哈希码值
 * hashCode方法的源码：
 * 		public native int hashCode();
 * 		native 代表该方法调用的是本地操作系统的方法
 * 
 */
public class Demo01HashCode {

	public static void main(String[] args) {
		//person类继承了object类 所以可以使用object类的hashCode方法
		Person p1 = new Person();
		int i = p1.hashCode();
		System.out.println(i);
		
		/*
		 * tostring方法的源码
		 * 		return getClass().getName()+"@"+Integer.toHexString(hashCode());
		 */
		System.out.println(p1);
		
		/*
		 * string类的哈希值
		 * 		string类重写object类的 hashCode方法
		 * 
		 * 
		 */
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("重地".hashCode());
		System.out.println("通话".hashCode());
	}
	
}
