package com.ithe.demo01.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 所有单列集合的最顶层的接口    里面定义了所有单列集合共性的方法
任意的单例集合都可以使用Collection接口中的方法
共性的方法
public boolean add(E e);把给定的对象添加到当前的集合中
public void clear();清空集合中所有的元素
public boolean remove(E e);把给定的对象在当前的集合中删除
public boolean contains(E e);判断当前集合中是否包含给定的对象
public boolean isEmpty();判断当前集合是否为空
public int size();返回集合中元素的个数
public Object[] toArray();把集合中的元素，存储到数组中
 * 
 * 
 * 
 */
public class Demo01Collection {
	   public static void main(String[] args) {
	        //创建集合对象 可以使用多态
	        Collection<String> coll = new ArrayList<>();
	        System.out.println(coll);				//重写了toString方法    []
	        boolean b1 = coll.add("张三");
	        System.out.println(coll);

	        coll.add("李四");
	        coll.add("王五");
	        coll.add("赵六");
	        coll.add("田七");
	        System.out.println(coll);

	        boolean b2 = coll.remove("赵六");
	        System.out.println(b2);
	        boolean b3 = coll.remove("赵si");        //删除不存在的对象返回false
	        System.out.println(b3);

	        boolean bs = coll.contains("赵四");		
	        System.out.println(bs);

	        boolean empty = coll.isEmpty();
	        System.out.println(empty); 				//集合不为空返回false
	        
	        int size = coll.size();
	        System.out.println(size);
	        
	        Object[] array = coll.toArray();		//把集合中的元素，存储到数组中	
	        for(int i=0;i<array.length;i++){
	        	System.out.println(array[i]);
	        }
	        
	        coll.clear();							//清空集合  但是集合还存在
	        System.out.println(coll);
	    }	
}
