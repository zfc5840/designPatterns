package com.model.designPatterns.patterns.mediatorPattern;

/**
 * Created by zhangfucheng on 15/9/15.
 */
public abstract class Mediator {

    //定义同事类
    private ConcreteColleague concreteColleague1;
    private ConcreteColleague concreteColleague2;

    public ConcreteColleague getConcreteColleague1() {
        return concreteColleague1;
    }

    public void setConcreteColleague1(ConcreteColleague concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public ConcreteColleague getConcreteColleague2() {
        return concreteColleague2;
    }

    public void setConcreteColleague2(ConcreteColleague concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }

    //中介者模式的业务逻辑
    public abstract  void doSomething1();

    public abstract  void doSomething2();
}
