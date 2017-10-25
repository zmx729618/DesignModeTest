package org.zmx.designmode.flyweight;

/**
 * Created by zhangwenchao on 2017/7/14.
 */
//具体享元角色类
public class ConcreteFlyweight implements Flyweight {

    private String intrinsicState = null;//内蕴状态
    /**
     * 构造函数，内蕴状态作为参数传入
     *
     * @param intrinsicState
     */
    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    /**
     * 外蕴状态作为参数传入方法中，改变方法的行为， 但是并不改变对象的内蕴状态。
     */
    @Override
    public void operation(String state) {
        System.out.println("内蕴状态= " + this.intrinsicState);
        System.out.println("外蕴状态 = " + state);
    }

}