/**
 * Description: BenzModel.java
 * All Rights Reserved.
 * @version 1.0  2015-5-8 下午1:37:51  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.patterns.builderPattern.impl;

import com.model.designPatterns.patterns.builderPattern.CarModel;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-5-8 下午1:37:51  by 张富成（fc.zhang@zuche.com）创建
 */
public class BenzModel extends CarModel{

	/**
	 * Description: 
	 * @Version1.0 2015-5-8 下午1:38:12 by 张富成（fc.zhang@zuche.com）创建
	 */
	@Override
	protected void start() {
	System.out.println("奔驰车启动");
		
	}

	/**
	 * Description: 
	 * @Version1.0 2015-5-8 下午1:38:12 by 张富成（fc.zhang@zuche.com）创建
	 */
	@Override
	protected void stop() {
	System.out.println("奔驰车停止");
		
	}

	/**
	 * Description: 
	 * @Version1.0 2015-5-8 下午1:38:12 by 张富成（fc.zhang@zuche.com）创建
	 */
	@Override
	protected void alarm() {
		System.out.println("奔驰车鸣笛");
		
	}

	/**
	 * Description: 
	 * @Version1.0 2015-5-8 下午1:38:12 by 张富成（fc.zhang@zuche.com）创建
	 */
	@Override
	protected void engineBoom() {
		System.out.println("奔驰车引擎发动");
	}

}
