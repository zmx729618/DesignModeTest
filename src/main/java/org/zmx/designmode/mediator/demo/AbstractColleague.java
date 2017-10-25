package org.zmx.designmode.mediator.demo;

/**
 * Created by zhangwenchao on 2017/8/1.
 */
public abstract class AbstractColleague {

    protected int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // 注意这里的参数不再是同事类，而是一个中介者
    public abstract void setNumber(int number, AbstractMediator am);
}


