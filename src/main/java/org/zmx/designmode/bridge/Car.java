package org.zmx.designmode.bridge;

/**
 * Created by zhangwenchao on 2017/7/13.
 */
//抽象部分
public abstract class Car {
    private Engine engine;// 持有一个实现部分对象，形成聚合关系

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public abstract void install();
}
