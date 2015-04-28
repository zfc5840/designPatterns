/**
 * Description: Price.java
 * All Rights Reserved.
 * @version 1.0  2015-4-28 下午3:45:24  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.strategyPattern;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-4-28 下午3:45:24  by 张富成（fc.zhang@zuche.com）创建
 */
public class Price {
	 // 持有一个具体的策略对象  
    private MemberStrategy strategy;  
      
    /** 
     * 构造函数，传入一个具体的策略对象 
     *  
     * @param strategy 
     *            具体的策略对象 
     */
    public Price(MemberStrategy strategy) {  
        this.strategy = strategy;  
    }  
      
    /** 
     * 计算图书的价格 
     *  
     * @param booksPrice 
     *            图书的原价 
     * @return 计算出打折后的价格 
     */
    public double quote(double booksPrice) {  
        return this.strategy.calcPrice(booksPrice);  
    }  
}
