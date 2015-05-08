/**
 * Description: Human.java
 * All Rights Reserved.
 * @version 1.0  2015-5-8 上午10:20:36  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.patterns.abstractFactoryPattern;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-5-8 上午10:20:36  by 张富成（fc.zhang@zuche.com）创建
 */
public interface Human {
  
	//每个人种都有相应的颜色
	public void getColor();
	//人类都会说话
	public void talk();
	//每个人都有性别
	public void getSex();
}
