/**
 * Description: IGamePlayer.java
 * All Rights Reserved.
 * @version 1.0  2015-5-8 下午2:30:29  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.patterns.proxyPattern;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-5-8 下午2:30:29  by 张富成（fc.zhang@zuche.com）创建
 */
public interface IGamePlayer {
    //登录游戏
	public void login(String user,String password);
	
	//杀怪
	public void killBoss();
	
	//升级
	public void upgrade();
}
