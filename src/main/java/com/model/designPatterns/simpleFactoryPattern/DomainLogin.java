/**
 * Description: DomainLogin.java
 * All Rights Reserved.
 * @version 1.0  2015-4-28 下午2:49:03  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.simpleFactoryPattern;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-4-28 下午2:49:03  by 张富成（fc.zhang@zuche.com）创建
 */
public class DomainLogin implements Login{

	/**
	 * Description: 
	 * @Version1.0 2015-4-28 下午2:49:14 by 张富成（fc.zhang@zuche.com）创建
	 * @param name
	 * @param password
	 * @return
	 */
	public boolean verify(String name, String password) {
     /*
      * 业务逻辑
      */
		System.out.println("域登录成功");
		return true;
	}

}
