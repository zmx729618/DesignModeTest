package org.zmx.designmode.command.demo;

/**
 * Created by zhangwenchao on 2017/7/28.
 */
/**
 * 抽象命令者角色
 * 封装请求(命令)的若干方法
 * 比如指挥官有三条命令
 * 1 下蒙汗药  2 策反敌营士兵  3 偷袭敌营指挥官
 * 就可以通过抽象命令者角色的execute()方法封装
 * 子类有三种具体实现
 * @author Administrator
 *
 */
public interface Command {
    /**
     * 执行方法
     */
    void execute();
}

