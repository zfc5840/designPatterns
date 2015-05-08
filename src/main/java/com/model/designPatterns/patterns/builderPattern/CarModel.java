/**
 * Description: CarModel.java
 * All Rights Reserved.
 * @version 1.0  2015-5-8 下午1:32:00  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.patterns.builderPattern;

import java.util.ArrayList;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-5-8 下午1:32:00  by 张富成（fc.zhang@zuche.com）创建
 */
public abstract class CarModel {
   private ArrayList<String> sequence= new ArrayList<String>();
   protected abstract void start();
   protected abstract void stop();
   protected abstract void alarm();
   protected abstract void engineBoom();
   final public void run(){
	   for(int i=0;i<this.sequence.size();i++){
		   String actionName=this.sequence.get(i);
		   if(actionName.equalsIgnoreCase("start")){
			   this.start();
		   }else if(actionName.equalsIgnoreCase("stop")){
			   this.stop();
		   }else if(actionName.equalsIgnoreCase("alarm")){
			   this.alarm();
		   }else if(actionName.equalsIgnoreCase("engineboom")){
			   this.engineBoom();
		   }
	   }
   }
   
   //把传递过来的值传递到类内
   final public void setSequence(ArrayList<String> sequence){
	   this.sequence=sequence;
   }
}
