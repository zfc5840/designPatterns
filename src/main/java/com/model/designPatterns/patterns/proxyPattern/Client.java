/**
 * Description: Client.java
 * All Rights Reserved.
 * @version 1.0  2015-5-8 下午5:10:11  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.patterns.proxyPattern;

import com.model.designPatterns.patterns.proxyPattern.impl.GamePlayer;
import com.model.designPatterns.patterns.proxyPattern.impl.GamePlayerProxy;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-5-8 下午5:10:11  by 张富成（fc.zhang@zuche.com）创建
 */
public class Client {
   
	public static void main(String[] args){
		
		IGamePlayer gamePlayer = new GamePlayer("张三");
		GamePlayerProxy proxyPlayer = new GamePlayerProxy(gamePlayer);
		System.out.println("开始........");
		proxyPlayer.login("zhangsan", "");
		proxyPlayer.killBoss();
		proxyPlayer.upgrade();
		System.out.println("结束。。。。。。");
	}
}
