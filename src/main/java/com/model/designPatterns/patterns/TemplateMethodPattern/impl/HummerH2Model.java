/**
 * Description: HummerH2Model.java
 * All Rights Reserved.
 * @version 1.0  2015-5-8 上午10:58:39  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.patterns.TemplateMethodPattern.impl;

import com.model.designPatterns.patterns.TemplateMethodPattern.HummerModel;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-5-8 上午10:58:39  by 张富成（fc.zhang@zuche.com）创建
 */
public class HummerH2Model extends HummerModel{

	/**
	 * Description: 
	 * @Version1.0 2015-5-8 上午11:00:18 by 张富成（fc.zhang@zuche.com）创建
	 */
	public void start() {
		System.out.println("悍马H2启动");
	}

	/**
	 * Description: 
	 * @Version1.0 2015-5-8 上午11:00:18 by 张富成（fc.zhang@zuche.com）创建
	 */
	public void stop() {
		System.out.println("悍马H2停止");
	}

	/**
	 * Description: 
	 * @Version1.0 2015-5-8 上午11:00:18 by 张富成（fc.zhang@zuche.com）创建
	 */
	public void alarm() {
		System.out.println("悍马H2鸣笛");
	}

	/**
	 * Description: 
	 * @Version1.0 2015-5-8 上午11:00:18 by 张富成（fc.zhang@zuche.com）创建
	 */
	public void engineBoom() {
		System.out.println("悍马H2引擎发动");
	}

	public boolean isAlarm(){
		return false;
	}
}
