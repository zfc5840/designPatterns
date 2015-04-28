/**
 * Description: MemberStrategy.java
 * All Rights Reserved.
 * @version 1.0  2015-4-28 下午3:39:00  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.strategyPattern;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-4-28 下午3:39:00  by 张富成（fc.zhang@zuche.com）创建
 */
public interface MemberStrategy {
	  /**
	 * Description: 计算图书价格
	 * @Version1.0 2015-4-28 下午3:39:20 by 张富成（fc.zhang@zuche.com）创建
	 * @param booksPrice
	 * @return
	 */
	public double calcPrice(double booksPrice); 
}
