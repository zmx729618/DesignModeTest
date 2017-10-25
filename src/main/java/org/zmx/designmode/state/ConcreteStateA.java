package org.zmx.designmode.state;

/**
 * Created by zhangwenchao on 2017/7/31.
 */
public class ConcreteStateA implements State {

    @Override
    public void handle(String sampleParameter) {

        System.out.println("ConcreteStateA handle ：" + sampleParameter);
    }

}
