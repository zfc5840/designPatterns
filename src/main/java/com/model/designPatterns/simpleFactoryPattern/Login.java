/**
 * Description: Login.java
 * All Rights Reserved.
 * @version 1.0  2015-4-28 下午2:47:07  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.simpleFactoryPattern;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-4-28 下午2:47:07  by 张富成（fc.zhang@zuche.com）创建
 */
public interface Login {
	//登录验证
    public boolean verify(String name , String password);
}
