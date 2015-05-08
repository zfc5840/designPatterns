/**
 * Description: Client.java
 * All Rights Reserved.
 * @version 1.0  2015-5-8 上午11:05:13  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.patterns.TemplateMethodPattern;

import com.model.designPatterns.patterns.TemplateMethodPattern.impl.HummerH1Model;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-5-8 上午11:05:13  by 张富成（fc.zhang@zuche.com）创建
 */
public class Client {
	
   public static void main(String[] args){
	   //XX公司要H1型号的悍马
	   HummerModel h1= new HummerH1Model();
	   //H1模型演示
	   h1.run();
   }
}
