package org.zmx.designmode.mediator;

/**
 * Created by zhangwenchao on 2017/8/1.
 */
public class Colleague {

    //持有一个调停者对象
    private Mediator mediator;

    /**
     * 构造函数
     */
    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    /**
     * 获取当前同事类对应的调停者对象
     */
    public Mediator getMediator() {
        return mediator;
    }

}
