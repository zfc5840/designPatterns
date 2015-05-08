/**
 * Description: CarBuilder.java
 * All Rights Reserved.
 * @version 1.0  2015-5-8 下午1:52:32  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.patterns.builderPattern;

import java.util.ArrayList;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-5-8 下午1:52:32  by 张富成（fc.zhang@zuche.com）创建
 */
public abstract class CarBuilder {
    
	public abstract void setSequence(ArrayList<String> sequence);
	
	public abstract CarModel getCarModel();
}
