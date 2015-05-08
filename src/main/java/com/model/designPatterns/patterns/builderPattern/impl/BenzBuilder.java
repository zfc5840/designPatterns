/**
 * Description: BenzBuilder.java
 * All Rights Reserved.
 * @version 1.0  2015-5-8 下午1:54:01  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.patterns.builderPattern.impl;

import java.util.ArrayList;

import com.model.designPatterns.patterns.builderPattern.CarBuilder;
import com.model.designPatterns.patterns.builderPattern.CarModel;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-5-8 下午1:54:01  by 张富成（fc.zhang@zuche.com）创建
 */
public class BenzBuilder extends CarBuilder{
	BenzModel benz= new BenzModel();

	/**
	 * Description: 
	 * @Version1.0 2015-5-8 下午1:54:20 by 张富成（fc.zhang@zuche.com）创建
	 * @param sequence
	 */
	@Override
	public void setSequence(ArrayList<String> sequence) {
	
		this.benz.setSequence(sequence);
	}

	/**
	 * Description: 
	 * @Version1.0 2015-5-8 下午1:54:20 by 张富成（fc.zhang@zuche.com）创建
	 * @return
	 */
	@Override
	public CarModel getCarModel() {
		return this.benz;
	}

}
