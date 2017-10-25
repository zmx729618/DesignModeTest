package org.zmx.designmode.bridge;

/**
 * Created by zhangwenchao on 2017/7/13.
 */
public class Client {

    public static void main(String[] args) {
        //创建实现(行为)  ->Engine引擎
        //第一种 引擎
        Engine engine200=new Engine200();
        //第二种 引擎
        Engine engine300=new Engine300();
        //创建抽象    ->车
        Car benz=new Benz(engine200);
        benz.install();

        Car bwm=new Bwm(engine300);
        bwm.install();
    }

}
