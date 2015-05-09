/**
 * Description: AdvancedMemberStrategy.java
 * All Rights Reserved.
 * @version 1.0  2015-4-28 下午3:43:05  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.strategyPattern;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-4-28 下午3:43:05  by 张富成（fc.zhang@zuche.com）创建
 */
public class AdvancedMemberStrategy implements MemberStrategy{

	/**
	 * Description: 
	 * @Version1.0 2015-4-28 下午3:43:22 by 张富成（fc.zhang@zuche.com）创建
	 * @param booksPrice
	 * @return
	 */
	public double calcPrice(double booksPrice) {
		System.out.println("高级会员折扣为 20%");
		return booksPrice*0.8;
	}

}
