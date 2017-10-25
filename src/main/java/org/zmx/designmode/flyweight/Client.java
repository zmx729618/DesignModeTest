package org.zmx.designmode.flyweight;

/**
 * Created by zhangwenchao on 2017/7/14.
 */
public class Client {

    public static void main(String[] args) {
        FlyweightFactory factory = FlyweightFactory.getInstance();

        Flyweight fly1 = factory.factory("辣椒炒肉");

        fly1.operation("顾客1点菜");

        Flyweight fly2 = factory.factory("牛肉");
        fly2.operation("顾客2点菜");

        Flyweight fly3 = factory.factory("辣椒炒肉");
        fly3.operation("顾客3点菜");

        System.out.println(fly1==fly3);
        System.out.println("被点不同的菜的个数"+factory.getFlyWeightSize());
    }


}
