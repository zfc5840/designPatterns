/**
 * Description: LoginFactory.java
 * All Rights Reserved.
 * @version 1.0  2015-4-28 下午2:52:35  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.simpleFactoryPattern;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-4-28 下午2:52:35  by 张富成（fc.zhang@zuche.com）创建
 */
public class LoginFactory {
	 /**
	 * Description: 
	 * @Version1.0 2015-4-28 下午2:52:51 by 张富成（fc.zhang@zuche.com）创建
	 * @param type
	 * @return
	 */
	public static Login factory(String type){
	        if(type.equals("password")){
	            
	            return new PasswordLogin();
	            
	        }else if(type.equals("passcode")){
	            
	            return new DomainLogin();
	            
	        }else{
	            /**
	             * 这里抛出一个自定义异常会更恰当
	             */
	            throw new RuntimeException("没有找到登录类型");
	        }
	    }
}
