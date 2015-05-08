/**
 * Description: Client.java
 * All Rights Reserved.
 * @version 1.0  2015-5-8 上午10:32:52  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.patterns.abstractFactoryPattern;

import com.model.designPatterns.patterns.abstractFactoryPattern.impl.FemaleFactory;
import com.model.designPatterns.patterns.abstractFactoryPattern.impl.MaleFactory;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-5-8 上午10:32:52  by 张富成（fc.zhang@zuche.com）创建
 */
public class Client {
   public static void main(String[] args){
	   //第一条生产线，男性生产线
	   HumanFactory meleHunmanFactory = new MaleFactory();
	   //第二条生产线，女性生产线
	   HumanFactory femaleHumanFactory = new FemaleFactory();
	   //生产线完毕，开始生产人
	   Human maleYellowHuman = meleHunmanFactory.createYellowMan();
	   Human femaleYellowHuman = femaleHumanFactory.createYellowMan();
	   System.out.println("开始生产一个黄色女性");
	   femaleYellowHuman.getColor();
	   femaleYellowHuman.talk();
	   femaleYellowHuman.getSex();
	   System.out.println("开始生产一个黄色男性");
	   maleYellowHuman.getColor();
	   maleYellowHuman.talk();
	   maleYellowHuman.getSex();
   }
}
