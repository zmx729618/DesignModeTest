package org.zmx.designmode.strategy;

/**
 * Created by zhangwenchao on 2017/7/14.
 */
/**
 * 具体策略角色3
 * 挡住追兵 孙夫人断后，挡住追兵
 * @author Administrator
 *
 */
public class BlackEnemy implements IStrategy {

    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵...");

    }

}
