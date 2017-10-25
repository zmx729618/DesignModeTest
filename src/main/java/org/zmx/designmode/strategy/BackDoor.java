package org.zmx.designmode.strategy;

/**
 * Created by zhangwenchao on 2017/7/14.
 */
/**
 * 具体策略角色1：
 * 开后门 找乔国老帮忙，使孙权不能杀刘备
 * @author Administrator
 *
 */
public class BackDoor implements IStrategy {

    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力，使孙权不能杀刘备...");
    }
}
