package com.model.designPatterns.patterns.commandPattern;

/**
 * Created by zhangfucheng on 16/12/8.
 */
public class Client {
    public static void main(String[] args){
        Invoker invoker=new Invoker();
        Command command=new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();
    }
}
