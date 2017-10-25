package org.zmx.designmode.mediator.demo;

/**
 * Created by zhangwenchao on 2017/8/1.
 */
public abstract class AbstractMediator {

    protected AbstractColleague A;
    protected AbstractColleague B;

    public AbstractMediator(AbstractColleague a, AbstractColleague b) {
        A = a;
        B = b;
    }

    public abstract void AaffectB();

    public abstract void BaffectA();

}
