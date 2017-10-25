package org.zmx.designmode.factory.factorymethod;

/**
 * Created by zhangwenchao on 2017/6/26.
 */
public class BmwCarFactory implements AbstractCarFactory{
    @Override
    public Car ProduceCar() {
        return new BmwCar();
    }
}
