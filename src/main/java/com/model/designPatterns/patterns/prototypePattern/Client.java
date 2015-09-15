package com.model.designPatterns.patterns.prototypePattern;

/**
 * Created by zhangfucheng on 15/9/15.
 */
public class Client {

   public static void main(String[] args){
       //浅拷贝
       ThingShallow thingShallow=new ThingShallow();
       thingShallow.setValue("张三");
       ThingShallow thingShallowClone=thingShallow.clone();
       thingShallowClone.setValue("李四");
       System.out.println(thingShallow.getValue());


       //深拷贝，主要区别在于拷贝后的对象是否影响拷贝前的对象
       ThingDeep thingDeep=new ThingDeep();
       thingDeep.setValue("张三");
       ThingDeep thingDeepClone=thingDeep.clone();
       thingDeepClone.setValue("李四");
       System.out.println(thingDeep.getValue());
   }
}
