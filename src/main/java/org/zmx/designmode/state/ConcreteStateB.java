package org.zmx.designmode.state;

/**
 * Created by zhangwenchao on 2017/7/31.
 */
public class ConcreteStateB implements State {

    @Override
    public void handle(String sampleParameter) {

        System.out.println("ConcreteStateB handle ：" + sampleParameter);
    }

}
