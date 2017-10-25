package org.zmx.designmode.command.demo;

/**
 * Created by zhangwenchao on 2017/7/28.
 */
public class Commander {

    private Command command = null;// 持有命令对象

    public Commander() {

    }

    public Commander(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    // 完成命令下药  通过命令对象来完成
    public void finishCommand() {
        // 调用命令对象的执行命令的方法->完成指挥官发出的命令
        command.execute();
    }

}
