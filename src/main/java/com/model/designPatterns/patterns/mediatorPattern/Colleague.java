package com.model.designPatterns.patterns.mediatorPattern;

/**
 * Created by zhangfucheng on 15/9/15.
 */
public  abstract class Colleague {
    private Mediator mediator;
    public Colleague(Mediator mediator){
        this.mediator=mediator;
    }
}
