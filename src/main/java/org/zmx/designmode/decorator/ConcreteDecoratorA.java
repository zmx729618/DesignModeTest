package org.zmx.designmode.decorator;

/**
 * Created by zhangwenchao on 2017/7/12.
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        super.sampleOperation();
        // 写相关的业务代码
        System.out.println("A进行装饰");
    }

}
