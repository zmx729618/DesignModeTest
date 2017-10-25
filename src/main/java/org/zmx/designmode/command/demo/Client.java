package org.zmx.designmode.command.demo;

/**
 * Created by zhangwenchao on 2017/7/28.
 */
public class Client {

    public static void main(String[] args) {
        //创建接收者  士兵
        Soldier soldier=new Soldier();

        //创建命令
        Command medecineCommand=new MedicineCommand(soldier);
        Command defectCommand=new DefectCommand(soldier);
        Command attackCommand=new AttackCommand(soldier);
        //创建请求者   指挥官 发出三条命令
        Commander commander=new Commander();
        //完成下药命令
        commander.setCommand(medecineCommand);
        commander.finishCommand();

        //完成策反命令
        commander.setCommand(defectCommand);
        commander.finishCommand();

        //完成偷袭命令
        commander.setCommand(attackCommand);
        commander.finishCommand();

    }


}
