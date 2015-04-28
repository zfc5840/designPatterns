/**
 * Description: PasswordLogin.java
 * All Rights Reserved.
 * @version 1.0  2015-4-28 下午2:50:03  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.simpleFactoryPattern;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-4-28 下午2:50:03  by 张富成（fc.zhang@zuche.com）创建
 */
public class PasswordLogin implements Login{

	/**
	 * Description: 
	 * @Version1.0 2015-4-28 下午2:50:14 by 张富成（fc.zhang@zuche.com）创建
	 * @param name
	 * @param password
	 * @return
	 */
	@Override
	public boolean verify(String name, String password) {
		/*
		 * 具体业务逻辑
		 */
		System.out.println("密码登录成功");
		return true;
	}

}
