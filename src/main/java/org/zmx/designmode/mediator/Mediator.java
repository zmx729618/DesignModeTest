package org.zmx.designmode.mediator;

/**
 * Created by zhangwenchao on 2017/8/1.
 */
public interface Mediator {

    /**
     * 同事对象在自身改变的时候来通知调停者的方法
     * 让调停者去负责相应的与其他同事对象的交互
     */
    public void changed(Colleague c);

}
