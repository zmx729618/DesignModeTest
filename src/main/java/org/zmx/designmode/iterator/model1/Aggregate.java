package org.zmx.designmode.iterator.model1;

/**
 * Created by zhangwenchao on 2017/7/26.
 */
public abstract class Aggregate {

    /**
     * 工厂方法，创建相应迭代子对象的接口
     */
    public abstract Iterator createIterator();
}
