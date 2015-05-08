/**
 * Description: HummerModer.java
 * All Rights Reserved.
 * @version 1.0  2015-5-8 上午10:49:28  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.patterns.TemplateMethodPattern;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-5-8 上午10:49:28  by 张富成（fc.zhang@zuche.com）创建
 */
public abstract class HummerModel {
   /*
    * 首先，这个模型要能够被发动起来，
    */
	protected abstract void start();
	
	//停车
	protected abstract void stop();
	
	//发声
	protected abstract void alarm();
	
	//引擎声
	protected abstract void engineBoom();
	
	//开动起来
	final public void run(){
		this.start();
		this.engineBoom();
		if(this.isAlarm()){
			this.alarm();	
		}
		this.stop();
	}
	
	//钩子方法
	protected boolean isAlarm(){
		return true;
	}
}
