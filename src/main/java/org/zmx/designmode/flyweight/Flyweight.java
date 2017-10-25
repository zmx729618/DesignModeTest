package org.zmx.designmode.flyweight;

/**
 * Created by zhangwenchao on 2017/7/14.
 */
//抽象享元角色类
public interface Flyweight {
    //一个示意性方法，参数state是外蕴状态
    public void operation(String state);
}