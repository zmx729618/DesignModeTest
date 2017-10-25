package org.zmx.designmode.strategy;

/**
 * Created by zhangwenchao on 2017/7/14.
 *抽象策略角色：
 *  首先定义一个策略接口，这是诸葛亮老人家给赵云的三个锦囊妙计的接口。
 * @author Administrator
 *
 */
public interface IStrategy {
    //每个锦囊妙计都是一个可执行的算法。它有三种不同的实现
    public void operate();
}
