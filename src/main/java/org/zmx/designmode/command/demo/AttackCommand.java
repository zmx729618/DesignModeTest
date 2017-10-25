package org.zmx.designmode.command.demo;

/**
 * Created by zhangwenchao on 2017/7/28.
 */
/**
 * 具体命令者角色
 * 第三条命令 偷袭
 * @author Administrator
 *
 */
public class AttackCommand implements Command {
    private Soldier soldier=null;//持有相应的 接收者对象

    public AttackCommand(Soldier soldier) {
        this.soldier = soldier;
    }

    //实现偷袭的方法
    @Override
    public void execute() {
        soldier.attackCommander();
    }

}
