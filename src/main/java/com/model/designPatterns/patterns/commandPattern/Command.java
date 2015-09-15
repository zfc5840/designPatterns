package com.model.designPatterns.patterns.commandPattern;

/**
 * Created by zhangfucheng on 15/9/15.
 */
public abstract class Command {

    //定义命令执行者，子类可以直接使用
    protected RequirementGroup requirementGroup=new RequirementGroup();
    protected PageGroup pageGroup=new PageGroup();

    //具体命令执行方法
    public abstract void execute();
}
