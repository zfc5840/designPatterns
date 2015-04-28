/**
 * Description: IntermediateMemberStrategy.java
 * All Rights Reserved.
 * @version 1.0  2015-4-28 下午3:41:48  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.strategyPattern;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-4-28 下午3:41:48  by 张富成（fc.zhang@zuche.com）创建
 */
public class IntermediateMemberStrategy implements MemberStrategy{

	/**
	 * Description: 
	 * @Version1.0 2015-4-28 下午3:42:02 by 张富成（fc.zhang@zuche.com）创建
	 * @param booksPrice
	 * @return
	 */
	@Override
	public double calcPrice(double booksPrice) {
		System.out.println("中级会员折扣为10%");
		return booksPrice*0.9;
	}

}
