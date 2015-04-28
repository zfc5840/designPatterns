/**
 * Description: Test.java
 * All Rights Reserved.
 * @version 1.0  2015-4-28 下午2:53:24  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.simpleFactoryPattern;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-4-28 下午2:53:24  by 张富成（fc.zhang@zuche.com）创建
 */
public class Test {
	 public static void main(String[] args) {
	        String loginType = "password";
	        String name = "name";
	        String password = "password";
	        Login login = LoginFactory.factory(loginType);
	        boolean bool = login.verify(name, password);
	        if (bool) {
	            /**
	             * 业务逻辑
	             */
	        	System.out.println("登录成功");
	        } else {
	            /**
	             * 业务逻辑
	             */
	        	System.out.println("登录失败");
	        }
	    }
}
