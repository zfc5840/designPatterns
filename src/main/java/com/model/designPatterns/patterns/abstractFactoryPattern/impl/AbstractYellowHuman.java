/**
 * Description: AbstractYellowHuman.java
 * All Rights Reserved.
 * @version 1.0  2015-5-8 上午10:22:37  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.patterns.abstractFactoryPattern.impl;

import com.model.designPatterns.patterns.abstractFactoryPattern.Human;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-5-8 上午10:22:37  by 张富成（fc.zhang@zuche.com）创建
 */
public abstract class AbstractYellowHuman implements Human{

	/**
	 * Description: 
	 * @Version1.0 2015-5-8 上午10:23:00 by 张富成（fc.zhang@zuche.com）创建
	 */
	public void getColor() {
		System.out.println("黄种人的皮肤颜色是黄色的");
	}

	/**
	 * Description: 
	 * @Version1.0 2015-5-8 上午10:23:00 by 张富成（fc.zhang@zuche.com）创建
	 */
	public void talk() {
		System.out.println("黄种人会说话，一般都是双字节的");
	}


}
