/**
 * Description: Client.java
 * All Rights Reserved.
 * @version 1.0  2015-5-8 下午1:47:48  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.patterns.builderPattern;

import java.util.ArrayList;

import com.model.designPatterns.patterns.builderPattern.impl.BenzBuilder;
import com.model.designPatterns.patterns.builderPattern.impl.BenzModel;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-5-8 下午1:47:48  by 张富成（fc.zhang@zuche.com）创建
 */
public class Client {
   public static void main(String[] args){
	   Director director = new Director();
	   BenzModel benz = director.getBenzModel();
	   benz.run();
   }
}
