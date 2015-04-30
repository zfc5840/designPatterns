/**
 * Description: Client.java
 * All Rights Reserved.
 * @version 1.0  2015-4-30 上午10:03:35  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.SimpleResponsibilityPrinciplePatterns;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-4-30 上午10:03:35  by 张富成（fc.zhang@zuche.com）创建
 */
public class Client {
	public static void main(String[] args){  
        Animal animal = new Animal();  
        animal.breathe("牛");  
        animal.breathe("羊");  
        animal.breathe("猪");  
        animal.breathe2("鱼");  
    }  
}
