/**
 * Description: Client.java
 * All Rights Reserved.
 * @version 1.0  2015-4-28 下午3:46:56  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.strategyPattern;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-4-28 下午3:46:56  by 张富成（fc.zhang@zuche.com）创建
 */
public class Client {
	 public static void main(String[] args) {  
	        // 选择并创建需要使用的策略对象  
	        MemberStrategy strategy = new AdvancedMemberStrategy();  
	              
	        // 创建环境  
	        Price price = new Price(strategy);  
	        // 计算价格  
	        double quote = price.quote(300);  
	        System.out.println("图书的最终价格为：" + quote);  
	              
	   }  
}
