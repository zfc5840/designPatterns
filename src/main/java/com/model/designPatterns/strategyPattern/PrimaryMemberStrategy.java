/**
 * Description: PrimaryMemberStrategy.java
 * All Rights Reserved.
 * @version 1.0  2015-4-28 下午3:40:19  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.strategyPattern;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-4-28 下午3:40:19  by 张富成（fc.zhang@zuche.com）创建
 */
public class PrimaryMemberStrategy implements MemberStrategy{

	/**
	 * Description: 
	 * @Version1.0 2015-4-28 下午3:40:34 by 张富成（fc.zhang@zuche.com）创建
	 * @param booksPrice
	 * @return
	 */
	public double calcPrice(double booksPrice) {
		System.out.println("普通会员没有折扣");
		return booksPrice;
	}

}
