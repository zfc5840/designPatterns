/**
 * Description: Singleton02.java
 * All Rights Reserved.
 * @version 1.0  2015-5-8 上午10:05:38  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.patterns.singletonPattern;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-5-8 上午10:05:38  by 张富成（fc.zhang@zuche.com）创建
 */
public class Singleton02 {

	//此为懒汉模式，但是确实线程不安全的单例，解决办法是在getSingleton()方法前加synchronized关键字，或在方法内部增加synchronized来实现。
	private static Singleton02 singleton=null;
	
	//限制产生多个对象
	private Singleton02(){
		
	}
	
	//通过该方法获得实例对象
	public static Singleton02 getSingleton(){
		if(singleton==null){
			singleton=new Singleton02();
		}
		return singleton;
	}
}
