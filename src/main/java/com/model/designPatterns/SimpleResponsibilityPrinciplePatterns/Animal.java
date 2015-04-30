/**
 * Description: Animal.java
 * All Rights Reserved.
 * @version 1.0  2015-4-30 上午10:03:13  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.SimpleResponsibilityPrinciplePatterns;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-4-30 上午10:03:13  by 张富成（fc.zhang@zuche.com）创建
 */
public class Animal {
	public void breathe(String animal){  
        System.out.println(animal+"呼吸空气");  
    }  
  
    public void breathe2(String animal){  
        System.out.println(animal+"呼吸水");  
    }  
}
