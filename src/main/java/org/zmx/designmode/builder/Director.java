package org.zmx.designmode.builder;

/**
 * Created by zhangwenchao on 2017/6/22.
 */
public class Director {

    private Builder builder;


    public Director(Builder builder){
        this.builder = builder;
    }
    /**
     * 产品构造方法，负责调用各个零件建造方法,比如产品的生产顺序等
     */
    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
    }




}
