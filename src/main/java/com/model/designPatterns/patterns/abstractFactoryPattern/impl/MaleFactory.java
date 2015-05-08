/**
 * Description: MaleFactory.java
 * All Rights Reserved.
 * @version 1.0  2015-5-8 上午10:31:38  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.patterns.abstractFactoryPattern.impl;

import com.model.designPatterns.patterns.abstractFactoryPattern.Human;
import com.model.designPatterns.patterns.abstractFactoryPattern.HumanFactory;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-5-8 上午10:31:38  by 张富成（fc.zhang@zuche.com）创建
 */
public class MaleFactory implements HumanFactory{

	/**
	 * Description: 
	 * @Version1.0 2015-5-8 上午10:32:15 by 张富成（fc.zhang@zuche.com）创建
	 * @return
	 */
	@Override
	public Human createYellowMan() {
		return new MaleYellowHuman();
	}

}
