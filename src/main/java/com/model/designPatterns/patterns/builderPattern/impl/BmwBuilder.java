/**
 * Description: BmwBuilder.java
 * All Rights Reserved.
 * @version 1.0  2015-5-8 下午1:55:54  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.patterns.builderPattern.impl;

import java.util.ArrayList;

import com.model.designPatterns.patterns.builderPattern.CarBuilder;
import com.model.designPatterns.patterns.builderPattern.CarModel;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-5-8 下午1:55:54  by 张富成（fc.zhang@zuche.com）创建
 */
public class BmwBuilder extends CarBuilder{
 
	BmwModel bmw = new BmwModel();
	/**
	 * Description: 
	 * @Version1.0 2015-5-8 下午1:56:06 by 张富成（fc.zhang@zuche.com）创建
	 * @param sequence
	 */
	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.bmw.setSequence(sequence);
	}

	/**
	 * Description: 
	 * @Version1.0 2015-5-8 下午1:56:06 by 张富成（fc.zhang@zuche.com）创建
	 * @return
	 */
	@Override
	public CarModel getCarModel() {
		return bmw;
	}

}
