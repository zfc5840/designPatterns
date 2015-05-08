/**
 * Description: Director.java
 * All Rights Reserved.
 * @version 1.0  2015-5-8 下午2:00:38  by 张富成（fc.zhang@zuche.com）创建
 */
package com.model.designPatterns.patterns.builderPattern;

import java.util.ArrayList;

import com.model.designPatterns.patterns.builderPattern.impl.BenzBuilder;
import com.model.designPatterns.patterns.builderPattern.impl.BenzModel;
import com.model.designPatterns.patterns.builderPattern.impl.BmwBuilder;
import com.model.designPatterns.patterns.builderPattern.impl.BmwModel;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-5-8 下午2:00:38  by 张富成（fc.zhang@zuche.com）创建
 */
public class Director {
    private ArrayList<String> sequence = new ArrayList();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BmwBuilder bmwBuilder = new BmwBuilder();
    
    public BenzModel getBenzModel(){
    	this.sequence.clear();
    	this.sequence.add("start");
    	this.sequence.add("stop");
    	this.benzBuilder.setSequence(sequence);
    	return (BenzModel)this.benzBuilder.getCarModel();
    }
    
    public BmwModel getBmwModel(){
    	this.sequence.clear();
    	this.sequence.add("start");
    	this.sequence.add("stop");
    	this.bmwBuilder.setSequence(sequence);
    	return (BmwModel)this.bmwBuilder.getCarModel();
    }
}
