package org.zmx.designmode.factory.simplefactory;

/**
 * Created by zhangwenchao on 2017/6/26.
 */
public class MainTest {

    public static void main(String[] args)throws Exception{

        //告诉司机(工厂) 开奔驰车
        Car car = CarFactory.produceCar("benzCar");
        //下命令开车
        car.drive();

    }
}
