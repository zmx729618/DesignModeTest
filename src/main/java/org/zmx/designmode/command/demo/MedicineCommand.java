package org.zmx.designmode.command.demo;

/**
 * Created by zhangwenchao on 2017/7/28.
 */
/**
 * 具体命令者角色
 * 第一条命令 下药
 * @author Administrator
 *
 */
public class MedicineCommand implements Command {
    private Soldier soldier=null;//持有相应的 接收者对象


    public MedicineCommand(Soldier soldier) {
        this.soldier = soldier;
    }

    //实现下药的方法
    @Override
    public void execute() {
        soldier.addMedicine();
    }

}