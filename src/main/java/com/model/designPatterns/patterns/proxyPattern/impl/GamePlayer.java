/**
 * Description: GamePlayer.java
 * All Rights Reserved.
 * @version 1.0  2015-5-8 下午4:38:11  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.patterns.proxyPattern.impl;

import com.model.designPatterns.patterns.proxyPattern.IGamePlayer;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-5-8 下午4:38:11  by 张富成（fc.zhang@zuche.com）创建
 */
public class GamePlayer implements IGamePlayer{
 
	private String name="";
	public GamePlayer(String _name){
		this.name=_name;
	}
	
	public void login(String user, String password) {
		System.out.println("登录名为"+user+"的用户"+this.name+"登录成功");
	}
	
	public void killBoss() {
	   System.out.println(this.name+"正在杀怪");	
	}

	public void upgrade() {
		System.out.println(this.name+"又升了一级");
	}

}
