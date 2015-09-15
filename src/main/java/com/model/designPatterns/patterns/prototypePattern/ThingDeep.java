package com.model.designPatterns.patterns.prototypePattern;

import java.util.ArrayList;

/**
 * Created by zhangfucheng on 15/9/15.
 */
public class ThingDeep implements Cloneable{

    private ArrayList<String> arrayList=new ArrayList<String>();

    public ThingDeep clone(){
        ThingDeep thingShallow=null;
        try{
            thingShallow=(ThingDeep)super.clone();
            this.arrayList=(ArrayList<String>)this.arrayList.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return thingShallow;
    }

    public void setValue(String value){
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue(){
        return this.arrayList;
    }

}
