package com.model.designPatterns.patterns.mediatorPattern;

/**
 * Created by zhangfucheng on 15/9/15.
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void doSomething1() {
     super.getConcreteColleague1().doSomething1();
        super.getConcreteColleague2().doSomething1();
    }

    @Override
    public void doSomething2() {
        super.getConcreteColleague2().doSomething2();
        super.getConcreteColleague1().doSomething2();

    }
}
