/**
 * Description: GamePlayerProxy.java
 * All Rights Reserved.
 * @version 1.0  2015-5-8 下午5:13:13  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.patterns.proxyPattern.impl;

import com.model.designPatterns.patterns.proxyPattern.IGamePlayer;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-5-8 下午5:13:13  by 张富成（fc.zhang@zuche.com）创建
 */
public class GamePlayerProxy implements IGamePlayer{
	
	IGamePlayer iGamePlayer = null;

	public GamePlayerProxy(IGamePlayer _gamePlayer){
		this.iGamePlayer=_gamePlayer;
	}
	/**
	 * Description: 
	 * @Version1.0 2015-5-8 下午5:13:34 by 张富成（fc.zhang@zuche.com）创建
	 * @param user
	 * @param password
	 */
	public void login(String user, String password) {
		this.iGamePlayer.login(user, password);
	}

	/**
	 * Description: 
	 * @Version1.0 2015-5-8 下午5:13:34 by 张富成（fc.zhang@zuche.com）创建
	 */
	public void killBoss() {
		this.iGamePlayer.killBoss();
	}

	/**
	 * Description: 
	 * @Version1.0 2015-5-8 下午5:13:34 by 张富成（fc.zhang@zuche.com）创建
	 */
	public void upgrade() {
	   this.iGamePlayer.upgrade();
	}

}
