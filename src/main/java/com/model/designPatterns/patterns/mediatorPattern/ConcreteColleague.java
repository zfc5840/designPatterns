package com.model.designPatterns.patterns.mediatorPattern;

/**
 * Created by zhangfucheng on 15/9/15.
 */
public class ConcreteColleague extends  Colleague {
    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    public void doSomething1(){
        System.out.println("做something1");
    }

    public void doSomething2(){
        System.out.println("做something2");
    }
}
