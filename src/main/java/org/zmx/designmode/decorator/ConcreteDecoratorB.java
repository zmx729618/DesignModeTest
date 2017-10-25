package org.zmx.designmode.decorator;

/**
 * Created by zhangwenchao on 2017/7/12.
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        super.sampleOperation();
        // 写相关的业务代码
        System.out.println("B进行装饰");
    }

}
