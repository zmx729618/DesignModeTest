package org.zmx.designmode.command.demo;

/**
 * Created by zhangwenchao on 2017/7/28.
 */
/**
 * 具体命令者角色
 * 第二条命令 策反
 * @author Administrator
 *
 */
public class DefectCommand implements Command {
    private Soldier soldier=null;//持有相应的 接收者对象

    public DefectCommand(Soldier soldier) {
        this.soldier = soldier;
    }

    //实现策反的方法
    @Override
    public void execute() {
        soldier.defectSoldier();;
    }

}
