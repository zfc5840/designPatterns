/**
 * Description: Singleton.java
 * All Rights Reserved.
 * @version 1.0  2015-5-8 上午9:03:02  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.patterns.singletonPattern;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-5-8 上午9:03:02  by 张富成（fc.zhang@zuche.com）创建
 */
public class Singleton {
  //此模式为单例模式的懒汉模式
  private static final Singleton singleton=new Singleton();
  
  //使用private进行修饰，目的事限制产生多个对象
  private Singleton(){
	  
  }
  
  //通过该方法获得实例对象
  public static Singleton getSingleton(){
	  return singleton;
  }
  
  //类中其他方法，尽量事static
  public static void doSomething(){
	  
  }
}
